import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int d = sc.nextInt();

        // int[] A = new int[N];
        // int[] B = new int[M];

        int count = 0;
        for (int i = L; i <= R; i++) {
            // A[i] = sc.nextInt();
            if (i % d == 0) {
                count++;
            }
        }
       System.out.println(count);
    }
}