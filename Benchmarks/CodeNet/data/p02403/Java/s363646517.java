import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k, n;
        int[] a, b;
        a = new int[10];
        b = new int[10];
        for(i = 0; ; i++) {
            int H = sc.nextInt();
            a[i] = H;
            int W = sc.nextInt();
            b[i] = W;
            n = i;
            if(H == 0 || W == 0) break;
        }
        for(i = 0; i < n; i++) {
            for(j = 0; j < a[i]; j++) {
                for(k = 0; k < b[i]; k++) {
                    System.out.print("#");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
