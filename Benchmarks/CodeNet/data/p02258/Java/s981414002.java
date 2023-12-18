
import java.util.Scanner;

public class Main {
    public static int MAX = 200000;
    public static void main(String[] args) {
        int[] R = new int[MAX];
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0;i < n;i++) {
            R[i] = sc.nextInt();
        }
        int minv = R[0];
        int maxv = -2000000000;
        for(int j = 1;j < n;j++){
            maxv = Math.max(maxv,R[j] - minv);
            minv = Math.min(minv,R[j]);
        }
        System.out.println(maxv);
    }
}

