import java.util.Scanner;


public class Main {

    static void solve() {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = scan.nextInt();
        }
        int cnt = 0;
        for (int i=0;i<arr.length;i++) {
            for (int j=i+1;j<arr.length;j++) {
                for (int t = j+1;t<arr.length;t++) {
                    if(isTr(arr[i], arr[j], arr[t])) {
                        cnt++;
                    }
                }
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

    static boolean isTr(long a, long b, long c) {
        if(a == b || a == c || b == c) {
            return false;
        }
        if (a + b <= c || a + c <= b || b + c <= a)
            return false;
        else
            return true;
    }


    static void solveCase(int t, int x, String s) {

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