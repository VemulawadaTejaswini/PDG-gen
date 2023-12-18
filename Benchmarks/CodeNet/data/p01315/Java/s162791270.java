import java.util.Arrays;
import java.util.Scanner;

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
            if(Double.compare(this.incomeEff,o.incomeEff)==0){
                return this.name.compareTo(o.name);
            }
            return -Double.compare(this.incomeEff,o.incomeEff);
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
                int C =s.nextInt();
                int D = s.nextInt();
                int E = s.nextInt();
                int fruitNum = s.nextInt();
                int fruitPrice = s.nextInt();
                int multipleCropping = s.nextInt();

                int firstTime = A+B+C;
                int secondTime = D+E;
                int income = fruitPrice*fruitNum*multipleCropping-price;
                int time = firstTime+secondTime*multipleCropping;

                double incomeEff = (double)income/time;

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