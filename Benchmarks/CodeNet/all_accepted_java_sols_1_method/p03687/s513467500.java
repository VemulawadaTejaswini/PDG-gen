
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] words = sc.nextLine().toCharArray();
        int[] ans = new int['z'-'a'+1];
        for (int i = 'a'; i <= 'z'; i++) {
            int max = Integer.MIN_VALUE;
            int current = -1;
            for (int j = 0; j < words.length; j++) {
                if (words[j] == i) {
                    int tmp = j - current - 1;
                    max = max < tmp ? tmp : max;
                    current = j;
                }
            }
            int last = words.length - 1 - current;
            max = max < last ? last : max;
            ans[i - 'a'] = max;
        }
        int ret = Integer.MAX_VALUE;
        for (int n: ans) {
            ret = ret < n ? ret : n;
        }
        System.out.println(ret);
    }
}
