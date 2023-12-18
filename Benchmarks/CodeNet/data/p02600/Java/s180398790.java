import java.util.Scanner;


public class Main {

    static void solve() {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();


        if(n>=400 && n<=599) {
            System.out.println(8);
            return;
        }
        if(n>=600 && n<=799) {
            System.out.println(7);
            return;
        }
        if(n>=800 && n<=999) {
            System.out.println(6);
            return;
        }
        if(n>=1000 && n<=1199) {
            System.out.println(5);
            return;
        }
        if(n>=1200 && n<=1399) {
            System.out.println(4);
            return;
        }
        if(n>=1400 && n<=1599) {
            System.out.println(3);
            return;
        }
        if(n>=1600 && n<=1799) {
            System.out.println(2);
            return;
        }
        if(n>=1800 && n<=1999) {
            System.out.println(1);
            return;
        }


//        for (int i = 0; i < n; i++) {
//
//        }

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


    public static void main(String[] args) {

        solve();

    }


//
//    class Counter extends HashMap<Integer, Integer> {
//        public int get(int k) {
//            return containsKey(k) ? super.get(k) : 0;
//        }
//
//        public void add(int k, int v) {
//            put(k, get(k) + v);
//        }
//    }

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