import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;
import java.util.Scanner;


public class Main {
    static int sum = 0;
    static void solve() {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int d = scan.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            long x = scan.nextInt();
            long y = scan.nextInt();

            double res = Math.sqrt(x*x + y*y);
            if(res <= d) {
                cnt++;
            }
        }
        System.out.println(cnt);

//        int t = scan.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n = scan.nextInt();
//            int[] arr1 = new int[n];
//            for (int j = 0; j < n; j++) {
//                arr1[j] = scan.nextInt();
//            }
////            scase(n, arr1);
//        }


//        long t = scan.nextLong();

//        for (int i = 0; i < t; i++) {
//            int n = scan.nextInt();
////            scase(n);
//        }
    }


    static void solveCase(int t, int x, String s) {

    }

    static void scase(int[] arr1, int[] arr2) {
    }



    public static void main(String[] args)  {
        solve();
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