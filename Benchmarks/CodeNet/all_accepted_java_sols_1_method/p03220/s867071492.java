import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();
        double minDiff = 1000000;
        int minH = 0;
        for(int i = 0; i < N; i++){
            double diff = Math.abs(A - (T - sc.nextInt() * 0.006)) ;
            if(diff < minDiff) {
                minH = i;
                minDiff = diff;
            }
        }
        sc.close();

        System.out.println(minH + 1);
    }

}