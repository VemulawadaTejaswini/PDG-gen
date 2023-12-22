import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int n = arr.length;
        int lastR = 0;
        int[] rArr = new int[n];
        int lastL = n - 1;
        int[] lArr = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'R') {
                lastR = i;
            }
            rArr[i] = lastR;
            if (arr[n - i - 1] == 'L') {
                lastL = n - i - 1;
            }
            lArr[n - i - 1] = lastL;
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'R') {
                if ((lArr[i] - i) % 2 == 0) {
                    ans[lArr[i]]++;
                } else {
                    ans[lArr[i] - 1]++;
                }
            } else {
                if ((i - rArr[i]) % 2 == 0) {
                    ans[rArr[i]]++;
                } else {
                    ans[rArr[i] + 1]++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                sb.append(" ");
            }
            sb.append(ans[i]);
        }
        System.out.println(sb);
    }
}
