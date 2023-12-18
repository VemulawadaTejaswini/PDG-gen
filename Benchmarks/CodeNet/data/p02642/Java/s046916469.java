import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int c = 0;
        int C = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i]%A[j] == 0) {
                    c = c + 1;
                }   
            }
            if( c == 1) {
                C = C +1;
            }
            c = 0;
        }
        System.out.println(C);
    }
}