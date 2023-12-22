
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Map<BigInteger, Integer> memo;
    static boolean[][] vis;
    static List<List<Integer>> adj;
    static List<Integer> vertices;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; ++i) {
            int num =sc.nextInt();
            if (!set.add(num)) {
                System.out.println("NO");
                return;
            }

        }
            System.out.println("YES");
    }


    static int lowerBound(int[] arr, int element) {

        int low = 0, high = arr.length - 1, ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= element) {
                low = mid + 1;
                ans = mid;
            } else
                high = mid - 1;

        }

        return high;
    }

    static boolean isPalindrome(String word) {
        int i = 0, j = word.length() - 1;

        while (i <= j) {
            if (word.charAt(i++) != word.charAt(j--))
                return false;
        }

        return true;
    }

    static String longestPalindrome(String[] words, String word, int i) {
        if (i >= words.length) {
            if (isPalindrome(word))
                return word;

            return "";
        }

        if (word.length() > 0 && isPalindrome(word))
            return word;
        String left = longestPalindrome(words, word + words[i], i + 1);
        String right = longestPalindrome(words, word, i + 1);

        if (left.length() > 0)
            return left;
        return right;
    }


    static int solve(int[] arr, int i, int j, int k) {
        if (i == j && arr[i] <= k)
            return 1;

        int left = 0, right = 0;
        if (arr[i] <= k)
            left = solve(arr, i + 1, j, k) + 1;

        else if (arr[j] <= k)
            right = solve(arr, i, j - 1, k) + 1;

        return left + right;
    }

    static int minMove(BigInteger bg, int count) {
        if (bg.equals(BigInteger.ONE))
            return count;

        int first = Integer.MAX_VALUE, sec = Integer.MAX_VALUE, last = Integer.MAX_VALUE;
        if (bg.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO) == 0)
            first = minMove(bg.divide(BigInteger.valueOf(2)), count + 1);

        else if (bg.mod(BigInteger.valueOf(3)).compareTo(BigInteger.ZERO) == 0)
            sec = minMove(bg.multiply(BigInteger.valueOf(2)).divide(BigInteger.valueOf(3)), count + 1);

        else if (bg.mod(BigInteger.valueOf(5)).compareTo(BigInteger.ZERO) == 0)
            last = minMove(bg.multiply(BigInteger.valueOf(4)).divide(BigInteger.valueOf(5)), count + 1);

        if (memo.containsKey(bg))
            return memo.get(bg);

        memo.put(bg, Math.min(first, Math.min(sec, last)));

        return Math.min(first, Math.min(sec, last));
    }
}
