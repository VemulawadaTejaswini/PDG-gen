import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] num = new int[n];
        int sum = 0;
        double now = 0;
        for (int i = 0; i < n; i++){
            num[i] = input.nextInt();
            sum += num[i];
            now = Math.max(now,num[i]);
        }
        double ave = (double)sum / (double)num.length;
        int ans = 0;
        for (int i = 0; i < n; i++){
            if (now > Math.abs(num[i] - ave)){
                now = Math.abs(num[i] - ave);
                ans = i;
            }
        }
        System.out.println(ans);
    }
}