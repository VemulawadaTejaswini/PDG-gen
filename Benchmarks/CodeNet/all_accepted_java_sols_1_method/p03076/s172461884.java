import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = 0, c = 10;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 0) {
                ans += arr[i];
            } else {
                ans += ((arr[i] / 10) + 1) * 10;
                c = Math.min(arr[i] % 10, c);
            }
        }
        ans -= 10 - c;
        System.out.println(ans);
    }
}