import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int sum[] = new int[20*2000];
        for(int i = 0; i < 20*2000; i++) {
            sum[i] = 0;
        }
        sum[0] = 1;

        for(int i = 0; i < n; i++) {
            for(int j = 20*2000-1; j >= 0 ; j--) {
                if(sum[j] == 1) {
                    sum[j + A[i]] = 1;
                }
            }
        }

        int q = sc.nextInt();
        for(int i = 0; i < q; i++) {
            int m = sc.nextInt();
            if(sum[m] == 1) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}
