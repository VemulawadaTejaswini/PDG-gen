import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

import static java.lang.Math.max;


// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Main {

    static int[] memo;
    static long[][][] memo2;
    static int[][][] memo3;
    static BigInteger[][] vis;

    static int dr[] = {1, 0, -1, 0}; // trick to explore an implicit 2D grid
    static int dc[] = {0, 1, 0, -1}; // S,N,E,W neighbors
    int[][] dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    static int x[] = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int y[] = {-1, 0, 1, -1, 1, -1, 0, 1};

    static int n, q;
    static long[] arr, seg;
    static Map<Long, Long> occ;
    static Set<Long>[] seg2;

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        q = Integer.parseInt(st.nextToken());
        arr = new long[n];
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int h = (int) Math.ceil(Math.log(n) / Math.log(2));

        h = (int) (2 * Math.pow(2, h)) - 1;

        seg2 = new HashSet[h];

        for (int i = 0; i < h; ++i)
            seg2[i] = new HashSet<>();

        build(1, 0, n - 1);
        StringBuilder sb = new StringBuilder();
        while (q-- > 0) {
            st = new StringTokenizer(bf.readLine());
            int l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
            sb.append(get(1, 0, n - 1, --l, --r).size()).append("\n");
        }
        System.out.print(sb);

    }

    static void build(int p, int s, int e) {
        if (s == e) {
            seg2[p].add(arr[s]);
            return;
        }

        build(2 * p, s, (s + e) / 2);
        build(2 * p + 1, (s + e) / 2 + 1, e);

        seg2[p].addAll(seg2[2 * p]);
        seg2[p].addAll(seg2[2 * p + 1]);
    }

    static void update(int p, int s, int e, int i, long v) {
        if (s == e) {
            seg[p] = v;
            return;
        }

        if (i <= (s + e) / 2) update(2 * p, s, (s + e) / 2, i, v);
        else update(2 * p + 1, (s + e) / 2 + 1, e, i, v);

        seg[p] = seg[2 * p] + seg[2 * p + 1];
    }

    static Set<Long> get(int p, int s, int e, int a, int b) {
        Set<Long> left = new HashSet<>();
        Set<Long> right = new HashSet<>();
        Set<Long> result = new HashSet<>();

        if (s >= a && e <= b)
            return seg2[p];

        if (s > b || e < a)
            return result;

        left = get(2 * p, s, (s + e) / 2, a, b);
        result.addAll(left);
        right = get(2 * p + 1, (s + e) / 2 + 1, e, a, b);

        result.addAll(right);

        return result;

    }


    public static int solve(int[][] stacks, int k) {

        return solveSolu(stacks, k, stacks.length - 1, stacks[stacks.length - 1].length - 1, 0);
    }

    public static int solveSolu(int[][] stacks, int k, int i, int j, int sum) {

        if (j < 0 && k == 0)
            return sum;

        if (k == 0)
            return sum;

        if (i > 0 && stacks[i].length == 0)
            return solveSolu(stacks, k, i - 1, stacks[i - 1].length - 1, sum);

        if (i < 0 || j < 0 || k < 0)
            return sum;

        int left = solveSolu(stacks, k - 1, i, j - 1, sum + stacks[i][j]), right;
        if (i > 0)
            right = solveSolu(stacks, k, i - 1, stacks[i - 1].length - 1, sum);
        else
            right = solveSolu(stacks, k, i - 1, stacks[i].length - 1, sum);


        return Math.max(left, right);
    }


    public static List<Integer> primeFactors(int n) {
        List<Integer> list = new ArrayList<>();
        // Print the number of 2s that divide n
        while (n % 2 == 0) {
            list.add(2);
            n /= 2;
        }

        // n must be odd at this point. So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // While i divides n, print i and divide n
            while (n % i == 0) {
                list.add(i);
                n /= i;
            }
        }

        // This condition is to handle the case whien
        // n is a prime number greater than 2
        if (n > 2)
            list.add(n);

        return list;
    }

    static long divisors(int n) {
        long s = 0;

        for (int i = 1; i * i <= n; ++i) {
            if (n % i == 0) {
                s++;
            }

        }
        return s;
    }

    static long maxProduct(long[] arr, int i, int k, long prod) {
        if (i >= arr.length && k == 0)
            return prod;

        if (k == 0)
            return prod;

        if (i >= arr.length || k < 0)
            return Long.MIN_VALUE;

        //   if (memo3[i][k] != -1)
        // return memo3[i][k];

        //return memo3[i][k] = Math.max(maxProduct(arr, i + 1, k - 1, (prod * arr[i]) % 1000000007), maxProduct(arr, i + 1, k, prod));
        return 0;
    }


    static boolean reachNumber(long n, long i) {
        if (i == n)
            return true;

        if (i > n)
            return false;

        boolean multi10 = reachNumber(n, i * 10);
        boolean multi20 = reachNumber(n, i * 20);
        return multi10 || multi20;
    }


    static boolean checkPlusOrMinus(int[] arr, int i, int x, int sum) {

        if (i >= arr.length) {
            return sum == x;
        }

        boolean plus = checkPlusOrMinus(arr, i + 1, x, sum + arr[i]);
        boolean minus = checkPlusOrMinus(arr, i + 1, x, sum - arr[i]);
        return plus || minus;
    }

    static int maxGrid(int i, int j, int[][] grid) {
        if (i == grid.length - 1 && j == grid[0].length - 1)
            return grid[i][j];

        if (i >= grid.length || j >= grid[0].length)
            return Integer.MIN_VALUE;

        return grid[i][j] + max(maxGrid(i + 1, j, grid), maxGrid(i, j + 1, grid));
    }

    static int countEnd(int n, int e) {
        if (n == e)
            return 1;

        if (n > e)
            return 0;

        return countEnd(n + 1, e) + countEnd(n + 2, e) + countEnd(n + 3, e);
    }


    static int sumSets(int[] arr, int i, int s, int k) {
        if (s == 0 && k == 0)
            return 1;

        if (i >= arr.length)
            return 0;

        if (s < 0 || k <= 0)
            return 0;

        return sumSets(arr, i + 1, s - arr[i], k - 1) + sumSets(arr, i + 1, s, k);
    }


    static int countQAQ(String str, int i, String exp) {
        if (i >= str.length()) {
            if (exp.equals("QAQ"))
                return 1;

            return 0;
        }
        if (memo[i] != -1)
            return memo[i];

        int pick = countQAQ(str, i + 1, exp + str.charAt(i));
        int left = countQAQ(str, i + 1, exp);
        return memo[i] = pick + left;
    }


    static int maxDonations(int[] donations) {
        memo = new int[101];
        Arrays.fill(memo, -1);
        int max1 = maxDonate(donations, 0, false);
        Arrays.fill(memo, -1);
        int max2 = maxDonate(donations, 1, true);
        return max(max1, max2);
    }

    static int maxDonate(int[] arr, int i, boolean useEnd) {
        if (i >= arr.length)
            return 0;

        if (memo[i] != -1)
            return memo[i];

        if (i == arr.length - 1 && useEnd)
            return arr[i];

        if (i == arr.length - 1)
            return 0;

        int pick = maxDonate(arr, i + 2, useEnd) + arr[i];

        int left = maxDonate(arr, i + 1, useEnd);

        return memo[i] = max(pick, left);
    }


    static int longestZigZag(int[] sequence) {
        if (sequence.length < 2)
            return 1;

        return maxZigzag(sequence, 0, new ArrayList<>());
    }

    static int maxZigzag(int[] arr, int i, List<Integer> element) {

        if (i >= arr.length) {
            int max = 0;
            List<Integer> res = new ArrayList<>();
            if (element.size() > 0) {
                for (int j = 0; j < element.size() - 1; ++j) {
                    res.add(element.get(j + 1) - element.get(j));
                }
                boolean check = false;

                for (int j = 1; j < res.size(); j += 2) {

                    if (res.get(j) < res.get(j - 1) && res.get(j) < 0) {
                        check = true;
                    } else {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    max = max(max, element.size());
                }
                if (element.size() == 2)
                    return 2;
            }
            return max;
        }
        if (memo[i] != -1)
            return memo[i];

        element.add(arr[i]);
        int pick = maxZigzag(arr, i + 1, element);
        element.remove(element.size() - 1);
        int left = maxZigzag(arr, i + 1, element);

        return memo[i] = max(pick, left);
    }

    static int countSets(int[] arr, int n, int i, int k) {
        if (k == 0 && n == 0)
            return 1;

        if (i >= arr.length)
            return 0;

        if (n < 0 || k <= 0)
            return 0;

        return countSets(arr, n - arr[i], i + 1, k - 1) + countSets(arr, n, i + 1, k);

    }


    static long countSets(int n, int k, List<Integer> primes, int i) {
        if (k == 0 && n == 0)
            return 1;

        if (i >= primes.size() || i >= 187 || k == 0)
            return 0;

        if (n < 0)
            return 0;

        if (memo2[n][i][k] != -1)
            return memo2[n][i][k];

        return memo2[n][i][k] = countSets(n - primes.get(i), k - 1, primes, i + 1) + countSets(n, k, primes, i + 1);
    }

    static void generatePrimes(int n, List<Integer> list) {

        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        for (int i = 2; i * i <= n; ++i) {

            if (prime[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; ++i)
            if (prime[i])
                list.add(i);

    }

    static long countGroups(int[] arr, int d, int m, int i, int sum, int count) {
        if (sum == 0 && count == m)
            return 1;

        if (i >= arr.length)
            return 0;

        if (count > m)
            return 0;

        if (memo2[sum][count][i] != -1)
            return memo2[sum][count][i];

        int t = (sum + arr[i]) % d;   // if arr[i] is negative and brings sum below 0
        if (t < 0) t += d;         // increase by d to make it bigger than 0

        return memo2[sum][count][i] = countGroups(arr, d, m, i + 1, t, count + 1) + countGroups(arr, d, m, i + 1, sum, count);
    }


    static int countCoins(int[] arr, int x, int i) {
        if (i >= arr.length || x < 0)
            return 0;

        if (x == 0)
            return 1;

        int left = countCoins(arr, x - arr[i], i);
        int right = countCoins(arr, x, i + 1);

        return left + right;

    }

//
//    static int maxPage(int[] book, int[] page, int sumBook, int sumPage, int i, int maxPrice) {
//        if (i >= book.length && sumBook < maxPrice)
//            return sumPage;
//
//        if (sumBook > maxPrice)
//            return 0;
//
//        if (memo2[i][sumBook] != -1)
//            return memo2[i][sumBook];
//
//        int f = maxPage(book, page, sumBook + book[i], sumPage + page[i], i + 1, maxPrice);
//        int l = maxPage(book, page, sumBook, sumPage, i + 1, maxPrice);
//
//        return memo2[i][sumBook] = Math.max(f, l);
//    }

    static BigInteger getPaths(char[][] grid, int i, int j) {
        if (i >= grid.length || j >= grid[0].length)
            return BigInteger.ZERO;

        if (grid[i][j] == '*')
            return BigInteger.ZERO;

        if (i == grid.length - 1 && j == grid[0].length - 1 && grid[i][j] == '.')
            return BigInteger.ONE;

        if (vis[i][j].compareTo(BigInteger.valueOf(-1)) != 0)
            return vis[i][j];

        return vis[i][j] = getPaths(grid, i + 1, j).add(getPaths(grid, i, j + 1));
    }


//    static void sumCombination(int[] arr, Set<Integer> set, int i, int sum) {
//
//        if (i == arr.length) {
//            if (sum != 0) {
//                set.add(sum);
//                memo2[i][sum] = sum;
//            }
//            return;
//        }
//        if (sum != 0)
//            set.add(sum);
//
//        if (memo2[i][sum] != 0)
//            return;
//
//        sumCombination(arr, set, i + 1, sum + arr[i]);
//        sumCombination(arr, set, i + 1, sum);
//        memo2[i][sum] = sum;
//    }


    static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;

        int left = 1 + maxDepth(root.left);
        int right = 1 + maxDepth(root.right);

        return max(left, right);
    }

//    static int numDecodings(String s) {
//
//    }


    static int longestSubsequence(int[] arr, int difference) {

        return maxSubsequence2(arr, difference);
    }

    static int maxSubsequence2(int[] arr, int diff) {
        Map<Integer, Integer> map = new HashMap<>();

        int max = 0;
        for (int i = 0; i < arr.length; ++i) {
            map.put(arr[i], map.containsKey(arr[i] - diff) ? map.get(arr[i] - diff) + 1 : 1);
            max = max(max, map.get(arr[i]));
        }

        return max;
    }

    //Time limit exceeded

    static int maxSubsequence1(int[] arr, int diff) {
        int dp[] = new int[arr.length];
        Arrays.fill(dp, 1);
        int max = 0;
        for (int i = 0; i < arr.length; ++i) {

            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[j] - arr[i] == diff) {
                    dp[j] = dp[i] + 1;
                }
                max = max(dp[j], max);

            }


        }

        return max;
    }

    static String longestPalindrome(String s) {
        return lgstSubString(s);
    }

    static String lgstSubString(String s) {
        String res = "";
        StringBuilder concatenate;
        for (int i = 0; i < s.length(); ++i) {
            concatenate = new StringBuilder();
            for (int j = i; j < s.length(); ++j) {
                concatenate.append(s.charAt(j));
                if (isPalindrome(concatenate.toString()) && concatenate.length() > res.length())
                    res = concatenate.toString();
            }
        }

        return res;
    }

    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i <= j && s.charAt(i) == s.charAt(j)) {
            i++;
            j--;
        }

        return i > j;
    }

//    static int minDistance(String word1, String word2) {
//        memo2 = new int[word1.length() + 1][word2.length() + 1];
//        for (int i = 0; i < memo2.length; ++i) Arrays.fill(memo2[i], -1);
//
//        return editDistance(word1.length(), word2.length(), word1, word2);
//    }

//    static int editDistance(int i, int j, String w1, String w2) {
//        if (i == 0)
//            return j;
//
//        if (j == 0)
//            return i;
//
//        if (w1.charAt(i - 1) == w2.charAt(j - 1))
//            return memo2[i - 1][j - 1] = editDistance(i - 1, j - 1, w1, w2);
//
//        if (memo2[i - 1][j - 1] != -1)
//            return memo2[i - 1][j - 1];
//
//        return memo2[i - 1][j - 1] = 1 + min(editDistance(i, j - 1, w1, w2), min(editDistance(i - 1, j, w1, w2), editDistance(i - 1, j - 1, w1, w2)));
//    }


    static int maxSubArray(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        return maxSub(nums);
    }

    // Kadane's algorithm
    static int maxSub(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;

        for (int i = 0; i < nums.length; ++i) {
            sum += nums[i];
            max = max(max, sum);
            if (sum < 0)
                sum = 0;
        }
        return max;
    }

//    static int minDistance2(String word1, String word2) {
//        memo2 = new int[word1.length() + 1][word2.length() + 1];
//        for (int i = 0; i < memo2.length; ++i) Arrays.fill(memo2[i], -1);
//
//        return word1.length() + word2.length() - 2 * distance(word1.length() - 1, word2.length() - 1, word1, word2);
//    }

//    static int distance(int i, int j, String w1, String w2) {
//        if (i < 0 || j < 0)
//            return 0;
//
//        if (w1.charAt(i) == w2.charAt(j))
//            return 1 + distance(i - 1, j - 1, w1, w2);
//
//        if (memo2[i][j] != -1)
//            return memo2[i][j];
//
//        int x = distance(i - 1, j, w1, w2);
//        int y = distance(i, j - 1, w1, w2);
//
//        return memo2[i][j] = Math.max(x, y);
//
//    }


//    static int maxDonations(int[] donations) {
//        if (donations.length == 2)
//            return Math.max(donations[0], donations[1]);
//        return maxSum(0, donations);
//    }
//
//    static int maxSum(int i, int[] donations) {
//        if (i >= donations.length)
//            return 0;
//
//        if (i == donations.length - 1)
//            return maxSum(i + 1, donations);
//
//        int x = donations[i] + maxSum(i + 2, donations);
//        int y = maxSum(i + 2, donations);
//
//        return Math.max(x, y);
//    }

//    static int minimumDeleteSum(String s1, String s2) {
//        memo2 = new int[s1.length() + 1][s2.length() + 1];
//        for (int i = 0; i < memo2.length; ++i) Arrays.fill(memo2[i], -1);
//
//
//        return minDelete(0, 0, s1, s2);
//    }

    static int sumString(String string, int indx) {
        int sum = 0;

        for (int i = indx; i < string.length(); i++) {
            sum = sum + (int) string.charAt(i);
        }
        return sum;
    }

//    static int minDelete(int i, int j, String s1, String s2) {
//        if (i == s1.length())
//            return sumString(s2, j);
//
//        if (j == s2.length())
//            return sumString(s1, i);
//
//        if (s1.charAt(i) == s2.charAt(j))
//            return minDelete(i + 1, j + 1, s1, s2);
//
//        if (memo2[i][j] != -1)
//            return memo2[i][j];
//
//        int x = s1.charAt(i) + minDelete(i + 1, j, s1, s2);
//        int y = s2.charAt(j) + minDelete(i, j + 1, s1, s2);
//
//        return memo2[i][j] = min(x, y);
//    }


//    static int uniquePathsWithObstacles(int[][] obstacleGrid) {
//        memo3 = new int[obstacleGrid.length][obstacleGrid[0].length];
//
//        for (int i = 0; i < memo3.length; ++i) Arrays.fill(memo3[i], -1);
//
//        return path(memo3.length - 1, memo3[0].length - 1, obstacleGrid);
//
//    }


//    static int path(int i, int j, int[][] obstacleGrid) {
//        if (i < 0 || j < 0)
//            return 0;
//
//        if (obstacleGrid[i][j] == 1)
//            return 0;
//
//        if (i == 0 && j == 0)
//            return 1;
//
//        if (memo3[i][j] != -1)
//            return memo3[i][j];
//
//        int x = path(i - 1, j, obstacleGrid);
//        int y = path(i, j - 1, obstacleGrid);
//
//        return memo3[i][j] = x + y;
//
//
//    }


//    static int minPathSum(int[][] grid) {
//        memo2 = new int[grid.length][grid[0].length];
//        for (int i = 0; i < grid.length; ++i) Arrays.fill(memo2[i], -1);
//
//        return minPath(grid.length - 1, grid[0].length - 1, grid);
//    }

//    static int minPath(int i, int j, int[][] grid) {
//
//        if (i == 0 && j == 0)
//            return grid[i][j];
//
//        if (i < 0 || j < 0)
//            return Integer.MAX_VALUE;
//
//        if (memo2[i][j] != -1)
//            return memo2[i][j];
//
//        return memo2[i][j] = grid[i][j] + min(minPath(i - 1, j, grid), minPath(i, j - 1, grid));
//    }


//    static int findTargetSumWays(int[] nums, int S) {
//        memo2 = new int[nums.length][2001];
//        for (int i = 0; i < memo2.length; ++i) Arrays.fill(memo2[i], Integer.MIN_VALUE);
//        return findSumWays(0, 0, nums, S);
//    }

//    static int findSumWays(int i, int sum, int nums[], int S) {
//
//        if (sum == S && i == nums.length)
//            return 1 + findSumWays(i + 1, sum, nums, S);
//
//        if (i >= nums.length)
//            return 0;
//
//        if (memo2[i][sum + 1000] != Integer.MIN_VALUE)
//            return memo2[i][sum + 1000];
//
//
//        return memo2[i][sum + 1000] = findSumWays(i + 1, sum + nums[i], nums, S) + findSumWays(i + 1, sum - nums[i], nums, S);
//
//    }


    static int count(String meadow) {

        int count = 0;
        for (int i = 0; i < meadow.length() - 1; ++i) {

            if (meadow.charAt(i) == '(' && meadow.charAt(i + 1) == '|')
                count++;
            else if (meadow.charAt(i) == '|' && meadow.charAt(i + 1) == ')')
                count++;
            else if (meadow.charAt(i) == '(' && meadow.charAt(i + 1) == ')')
                count++;
        }
        return count;
    }


//    static int longestPalindromeSubseq(String s) {
//        memo2 = new int[s.length() + 1][s.length() + 1];
//        for (int i = 0; i < memo2[0].length; ++i) Arrays.fill(memo2[i], -1);
//
//        return longestPalin(0, s.length() - 1, s);
//    }

//    static int longestPalin(int i, int j, String s) {
//        if (i == j)
//            return 1;
//
//        if (s.charAt(i) == s.charAt(j) && i + 1 == j)
//            return 2;
//
//        if (s.charAt(i) == s.charAt(j))
//            return memo2[i][j] = 2 + longestPalin(i + 1, j - 1, s);
//
//        if (memo2[i][j] != -1)
//            return memo2[i][j];
//
//        int x = longestPalin(i + 1, j, s);
//        int y = longestPalin(i, j - 1, s);
//
//        return memo2[i][j] = Math.max(x, y);
//    }


    static int[] countBits(int num) {

        int res[] = new int[num + 1];
        for (int i = 0; i < res.length; ++i)
            res[i] = Integer.bitCount(i);

        return res;
    }

    static int rob(int[] nums) {
        memo = new int[1000];
        Arrays.fill(memo, -1);
        return maxCost(0, nums);
    }

    static int maxCost(int i, int nums[]) {

        if (i >= nums.length)
            return 0;

        if (memo[i] != -1)
            return memo[i];

        return memo[i] = max(nums[i] + maxCost(i + 2, nums), maxCost(i + 1, nums));
    }


    static int climbStairs(int n) {
        memo = new int[1000];
        Arrays.fill(memo, -1);

        return solution2(n + 1);
    }

    static int solution2(int n) {

        if (n == 1)
            return 1;

        if (n <= 0)
            return 0;

        if (memo[n] != -1)
            return memo[n];

        return memo[n] = solution2(n - 1) + solution2(n - 2);
    }

    public static boolean isSubsequence(String s, String t) {

        return solution(0, 0, s, t);
    }

    static boolean solution(int i, int j, String s, String t) {

        if (i == s.length())
            return true;

        if (j >= t.length())
            return false;

        if (s.charAt(i) == t.charAt(j))
            return solution(i + 1, j + 1, s, t);

        return solution(i, j + 1, s, t);
    }

    static {


    }

    static int unboundedKnapsack(int[] arr) {

        return calculateSum(0, arr, 0);
    }

    static int calculateSum(int i, int arr[], int sum) {
        if (i >= arr.length)
            return sum;

        int x = calculateSum(i + 1, arr, sum + arr[i]);
        int y = calculateSum(i + 1, arr, sum);
        return max(x, y);
    }

    static int minSteps(int n) {
        if (n == 1) {
            return 1;
        }
//
//        if (memo[n] != -1)
//            return memo[n];

        int div3 = Integer.MAX_VALUE, div2 = Integer.MAX_VALUE, sub1 = Integer.MAX_VALUE;
        if (n % 3 == 0) {
            div3 = minSteps(n / 3) + 1;
        }
        if (n % 2 == 0) {
            div2 = minSteps(n / 2) + 1;
        }
        sub1 = minSteps(n - 1) + 1;
//        memo[n] = Math.min(div3, Math.min(div2, sub1));

//        return memo[n];
        return 0;
    }

    public static int solution2(int[] A) {

        if (A.length < 1 || A.length > 100000)
            throw new IllegalArgumentException("Array should more than 1 or less than 100000");

        Set<Integer> set = new HashSet<>();
        for (int i : A) set.add(i);

        int largest = 0;

        for (int i : A) {
            if (i > 0 && set.contains(-i)) {
                largest = max(i, largest);
            }
        }

        return largest > 0 ? largest : 0;

    }


    public static void solution(int N) {
        if (N < 1)
            throw new IllegalArgumentException("Number should be more than one");
        if (N > 1000)
            throw new IllegalArgumentException("Number should be leess than 1000");

        for (int i = 1; i <= N; ++i) {
            if (((i & 1) == 0)) {
                if (i % 5 == 0)
                    System.out.println("CodilityCoders");
                else if ((i % 3 == 0))
                    System.out.println("CodilityTest");
                else
                    System.out.println("Codility");
            } else if (i % 3 == 0) {
                if (i % 5 == 0)
                    System.out.println("TestCoders");
                else
                    System.out.println("Test");
            } else if (i % 5 == 0)
                System.out.println("Coders");
            else
                System.out.println(i);
        }


    }


    static int minimumTime(int numOfParts, List<Integer> parts) {

        Collections.sort(parts);

        List<Integer> timeRequired = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < timeRequired.size(); ++i) {
            sum += timeRequired.get(i);
        }

        for (int i = 0; i < parts.size(); i += 2) {

            sum += parts.get(i) + parts.get(i + 1);
            timeRequired.add(parts.get(i) + parts.get(i + 1));

        }


        return sum;
    }


    static int removeObstacles(int numRows, int numColumns, List<List<Integer>> lot) {
        int[][] grid = new int[numRows][numColumns];
        boolean[][] vis = new boolean[numRows][numColumns];

        for (int i = 0; i < lot.size(); i++) {
            List<Integer> sub = lot.get(i);
            for (int j = 0; j < sub.size(); j++) {
                grid[i][j] = lot.get(i).get(j);
            }
        }

        int count = 0;

        Queue<Integer> queueRow = new LinkedList<>(), queueCol = new LinkedList<>();
        queueRow.add(0);
        queueCol.add(0);

        while (!queueRow.isEmpty()) {

            int row = queueRow.poll();
            int column = queueCol.poll();

            for (int i = 0; i < 4; ++i) {
                int nr = dr[i] + row;
                int nc = dc[i] + column;
                if (nr < 0 || nc < 0 || nr >= numRows || nc >= numColumns || grid[nr][nc] == 0 || vis[nr][nc]) {
                    continue;
                }
                vis[nr][nc] = true;
                if (grid[nr][nc] == 9) {
                    return count;
                }


                queueRow.offer(nr);
                queueCol.offer(nc);
            }
            count++;
        }
        return -1;
    }

    int remove(int numRows, int numColumns, List<List<Integer>> lot) {
        int[][] grid = new int[numRows][numColumns];
        boolean[][] vis = new boolean[numRows][numColumns];

        for (int i = 0; i < lot.size(); ++i) {
            List<Integer> sub = lot.get(i);
            for (int j = 0; j < sub.size(); ++j) {
                grid[i][j] = lot.get(i).get(j);
            }
        }

        int count = 0;


        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int row = current[0];
                int column = current[1];

                if (row < 0 || column < 0 || row >= numRows || column >= numColumns || grid[row][column] == 0 || vis[row][column]) {
                    continue;
                }

                vis[row][column] = true;
                if (grid[row][column] == 9) {
                    return count;
                }

                for (int[] d : dir) {
                    int nr = d[0] + row;
                    int nc = d[1] + column;
                    queue.offer(new int[]{nr, nc});
                }
            }
            count++;
        }
        return -1;
    }

    static void changeString(String b) {


        b += "d";
        System.out.println(b);

    }

    private static void permute(String str, int l, int r) {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}

class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
