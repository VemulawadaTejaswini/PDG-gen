import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int h[] = new int[n];
        int viewableCnt = 0;

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            for (int j = (i-1); j >= 0; j--) {
                if (h[i] < h[j]){
                    break;
                } else if (j == 0) {
                    viewableCnt++;
                }
            }
        }
        System.out.println(viewableCnt + 1);
        sc.close();
    }
}
