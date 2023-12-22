import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // int R = sc.nextInt();
        // int d = sc.nextInt();

        int[] n = new int[N];
        // int[] B = new int[M];

        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            // A[i] = sc.nextInt();
            if (i % 2 == 0 && n[i] % 2 == 1) {
                count++;
            }
        }
       System.out.println(count);
    }
}