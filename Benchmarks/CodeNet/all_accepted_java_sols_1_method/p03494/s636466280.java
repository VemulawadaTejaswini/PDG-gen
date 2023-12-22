import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int cnt = 0;
        boolean isAns = true;
        while (isAns) {
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 != 0) {
                    isAns = false;
                    break;
                }
                a[i] /= 2;
            }
            cnt++;
        }

        System.out.println(cnt-1);
    }
}
