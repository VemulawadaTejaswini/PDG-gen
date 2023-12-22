import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] ar = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
            sum+=ar[i];
        }
        double t = (double) sum/(double) (4*m);
        int cnt = 0;
        for (int i = n-1; i >= 0; i--) {
            if(ar[i] >= t) {
                cnt++;
            }
        }
        System.out.println(cnt >= m ? "Yes":"No");
    }
}
