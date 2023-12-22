import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();


        int left = Math.max(X-K+1,-1000000);
        int right = Math.min(X+K-1,1000000);

        for (int i = left; i <= right ; i++) {
            System.out.println(i);
        }


    }
}
