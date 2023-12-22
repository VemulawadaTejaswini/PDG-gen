import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        String ans = "Yes";

        int n = sc.nextInt();

        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        int lastValue = list[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            int value = list[i];
            if (value > lastValue) {
                if (value - lastValue == 1) {
                    value--;
                } else {
                    ans = "No";
                    break;
                }
            }
            lastValue = value;
        }

        System.out.println(ans);
    }
}