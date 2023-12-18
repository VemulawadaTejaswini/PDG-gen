import java.util.Scanner;


public class Main {

    static void solve() {
        Scanner scan = new Scanner(System.in);

        int r = scan.nextInt();
        int g = scan.nextInt();
        int b = scan.nextInt();
        int k = scan.nextInt();

        while(k>0) {
            if(r<g && g<b) {
                System.out.println("Yes");
                return;
            }
            if(r>=g) {
                g*=2;
            } else if(b<=g) {
                b*=2;
            }
            k--;
        }

        if(r<g && g<b) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");

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