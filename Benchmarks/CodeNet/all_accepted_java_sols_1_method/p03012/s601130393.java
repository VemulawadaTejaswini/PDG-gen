import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        ArrayList<Integer> series = new ArrayList<>();


        ArrayList<Integer> accs = new ArrayList<>();

        int acc = 0;

        for(int i=0; i<N; i++){
            int tmp = scanner.nextInt();
            series.add(tmp);
            acc += tmp;
            accs.add(acc);
        }


        int minDiff = Integer.MAX_VALUE;

        for(int tmpAcc: accs){
            int rest = acc - tmpAcc;

            int tmpDiff = Math.abs(rest - tmpAcc);

            if(tmpDiff < minDiff){
                minDiff = tmpDiff;
            }
        }

        System.out.println(minDiff);

    }
}
