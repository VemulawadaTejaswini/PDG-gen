
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mochi = new int[n];
        for (int i = 0; i < n; i++){
            mochi[i] = sc.nextInt();
        }
        Arrays.sort(mochi);
        int count = 0;
        int now = 101;
        for (int i = n - 1; 0 <= i; i--){
            if (mochi[i] < now) {
                count++;
                now = mochi[i];
            }
        }
        System.out.println(count);
    }
}
