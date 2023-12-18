import java.util.Scanner;

/**
 * Created by hwzheng on 2017/3/26.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] R = new int[n];
        for (int i = 0; i < n; i++){
            R[i] = scanner.nextInt();
        }
        System.out.println(maxProfit(R));
    }

    public static int maxProfit(int[] R){
        int maxv = R[1] - R[0];
        int minv = R[0];
        for (int i = 1; i < R.length; i++){
            maxv = Math.max(R[i]-minv,maxv);
            minv = Math.min(R[i],minv);
        }
        return maxv;
    }
}