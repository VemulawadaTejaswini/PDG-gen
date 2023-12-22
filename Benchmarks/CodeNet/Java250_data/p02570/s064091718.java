import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

    static void solve() {
        Scanner scan = new Scanner(System.in);

        int d = scan.nextInt();
        int t = scan.nextInt();
        int s = scan.nextInt();

        int tt = 0;
        if(d%s == 0) {
            tt = d/s;
        } else {
            tt = d/s + 1;
        }
        if(tt <= t) {
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }


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