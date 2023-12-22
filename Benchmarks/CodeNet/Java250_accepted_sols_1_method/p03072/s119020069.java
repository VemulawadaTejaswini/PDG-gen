import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] list = new int[n];

        int ans = 0;
        for (int i = 0 ; i < n; i ++) {
            int value = sc.nextInt();
            boolean canLookSea = true;
            for(int left : list) {
                if (left > value) {
                    canLookSea = false;
                    break;
                }
            }
            if (canLookSea) {
                ans++;
            }
            list[i] = value;
        }
        // 出力
        System.out.println(ans);
    }
}