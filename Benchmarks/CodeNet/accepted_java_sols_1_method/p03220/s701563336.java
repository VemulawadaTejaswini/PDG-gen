import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int t = sc.nextInt();
        int a = sc.nextInt();
        sc.nextLine();
        int[] h = new int[n];
        double[] cal = new double[n];
        double[] res = new double[n];
        for (int i = 0; i < n; i++){
            h[i] = sc.nextInt();
            cal[i] = t - h[i] * 0.006;
            res[i] = Math.abs(a-cal[i]);
        }
        double min = 999999;
        int ansewer = -1;
        for (int i = 0; i < n; i++){
            if (min > res[i]){
                min = res[i];
                ansewer = i + 1;
            }
        }
        System.out.println(ansewer);
    }
}
