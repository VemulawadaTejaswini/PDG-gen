import java.util.Scanner;

public class Main {

    private static int N;
    private static int[] atama = new int[10];
    private static int[] shiri = new int[10];
    private static int[] uho = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        for (int A = 1; A <= N; A++) {
            uho[Integer.valueOf(String.valueOf(A).charAt(0) + "" + (A % 10))]++;
        }
        
        int ans = 0;
        for(int i=11; i<100; i++) {
            if(i % 10 == 0) {
                continue;
            }
            
            ans += uho[i] * uho[(i / 10) + (10 * (i % 10))];
        }
        System.out.println(ans);
    }

}
