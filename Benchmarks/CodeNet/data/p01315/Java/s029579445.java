import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by k-mac on 2014/07/31.
 */
public class Main {
    static Scanner s = new Scanner(System.in);

    static class Crops implements Comparable<Crops> {
        String name;
        double incomeEff;

        Crops(String name, double incomeEff) {
            this.name = name;
            this.incomeEff = incomeEff;
        }

        public int compareTo(Crops o) {
            if(this.incomeEff-o.incomeEff<1e-9){
                return this.name.compareTo(o.name);
            }
            return (int) -(this.incomeEff - o.incomeEff);
        }
    }

    public static void main(String[] args) {
        while (true) {
            int N = s.nextInt();
            if(N==0)break;
            Crops[] crops = new Crops[N];


            for (int i = 0; i < N; i++) {
                String name = s.next();
                int price = s.nextInt();
                int A = s.nextInt();
                int B = s.nextInt();
                int C = s.nextInt();
                int beforeTime = A + B + C;
                int D = s.nextInt();
                int E = s.nextInt();
                int afterTime = D + E;
                int fruit = s.nextInt();
                int salePrice = s.nextInt();
                int fruitTime = s.nextInt();

                int allSalePrice=fruit * fruitTime * salePrice;
                int income = allSalePrice - price;
                int allTime=beforeTime + afterTime * fruitTime;
                double incomeEff = (double)income / allTime;

                crops[i] = new Crops(name, incomeEff);
            }

            Arrays.sort(crops);

            for (int i = 0; i < N; i++) {
                System.out.println(crops[i].name);
            }
            System.out.println("#");
        }

    }
}