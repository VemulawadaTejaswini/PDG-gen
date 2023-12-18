import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] list = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
            sum += list[i];
        }

        int ave = (int)Math.round((double)sum / n);

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int value = Math.abs(list[i] - ave);
            ans += value * value;
        }

        System.out.println(ans);
    }
}
