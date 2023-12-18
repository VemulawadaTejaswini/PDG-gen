import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

    static int res(String ss, String t) {
        int cnt = 0;
        for(int i=0;i<ss.length();i++) {
            if(ss.charAt(i) != t.charAt(i)) {
                cnt++;
            }
        }
        return cnt;
    }


    static void solve() {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger sum2 = BigInteger.valueOf(0);
        for (int i = 1; i < n; i++) {
            sum2 = sum2.add(BigInteger.valueOf(arr[i]));
        }
        for (int i = 0; i < n-1; i++) {
            BigInteger mult = BigInteger.valueOf(arr[i]).multiply(sum2);
            sum = sum.add(mult).mod(BigInteger.valueOf(1000000000 + 7));
            sum2 = sum2.subtract(BigInteger.valueOf(arr[i+1]));
//            for (int j = i+1; j < n; j++) {
//                BigInteger res  = BigInteger.valueOf(arr[i]).multiply(BigInteger.valueOf(arr[j]));//.mod(BigInteger.valueOf(1000000000 + 7));
//                sum = sum.add(res).mod(BigInteger.valueOf(1000000000 + 7));
//            }
        }
        System.out.println(sum);

//        int t = scan.nextInt();
//        for (int i = 0; i < t; i++) {
////            solveCase();
//        }


//        long t = scan.nextLong();

//        for (int i = 0; i < t; i++) {
//            int n = scan.nextInt();
////            scase(n);
//        }
    }


    static void solveCase(int zero1, int one1, int two1, int zero2, int one2, int two2) {

    }

    static void scase(int[] arr1, int[] arr2) {
    }


    public static void main(String[] args) {

        solve();
    }


    static class LoggerNode {
        String message;
        int ts;
    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}