
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Map<BigInteger, Integer> memo;
    static boolean[][] vis;
    static List<List<Integer>> adj;
    static List<Integer> vertices;

    static class Point {
        int i, j;

        public Point(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    //# North, South, East and West direction vectors
//dr = [-1, +1, 0, 0]
//dc = [0, 0, +1, -1]
    static int[][][] cache;
    static Map<Integer, Integer> memo2;

    void UVA_11407() throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(st.nextToken());
        while (t-- > 0) {
            st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            memo2 = new HashMap<>();
            sb.append(countTerm(n, 0, 0)).append("\n");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(n == 1 ? 0 : 1);



    }

    static boolean checkEmpty(String word,String res) {
        if (word.equals(""))
            return true;

        int count = 1;
        for (int i = 1; i < word.length(); ++i) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                count++;
                res += word.charAt(i);
            } else {
                if (res.length() >= 1)
                    res += word.charAt(i - 1);
                if (count >= 2) {
                    word = word.replace(res, "");
                    return checkEmpty(word,"");
                }
            }
        }
        if (res.length() >= 1)
            res += word.charAt(word.length() - 1);
        if (count >= 2) {
            word = word.replace(res, "");
            return checkEmpty(word,"");
        }
        return false;
    }


    static int countTerm(int n, int i, int count) {
        if (i > n)
            return Integer.MAX_VALUE;

        if (i == n)
            return count;

//        if (memo2.get(i) != null)
//            return memo2.get(i);

        int ret, min = Integer.MAX_VALUE;

        for (int j = 1; j <= n; ++j) {
            ret = countTerm(n, i + j * j, count + 1);
            min = Math.min(min, ret);
        }

        memo2.put(i, count);
        return min;
    }


    static int countStrings(char[] arr, int i, int s, int l, String concat) {
        if (i >= arr.length) {
            return 0;
        }
        if (l == 0) {
            int sum = 0;
            for (int j = 0; j < concat.length() - 1; ++j) {
                if (concat.charAt(j) > concat.charAt(j + 1))
                    return 0;
            }
            for (int j = 0; j < concat.length(); ++j) {
                sum += concat.charAt(j) - 'a' + 1;
            }
            if (sum == s)
                return 1;
            return 0;
        }
        if (l < 0)
            return 0;


        int left = countStrings(arr, i + 1, s, l - 1, concat + arr[i]);
        int right = countStrings(arr, i + 1, s, l, concat);

        return left + right;
    }

    static void countMoves(Point[][] grid, int start, int end, int start2, int end2, boolean[][] vis, int sumRed, int sumBlue) {
        if (start >= grid.length || start < 0 || end >= grid[0].length || end < 0)
            return;

        // countMoves(grid,start+1,end,start2,end2,vis,sumRed+grid[start][end].i,sumB);

    }


    static long countWin(long h) {
        if (h == 1)
            return 1;

        return 2 * countWin(h / 2) + 1;

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
