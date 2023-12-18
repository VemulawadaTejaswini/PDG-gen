import java.util.Scanner;


public class Main {


    static void solve() {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        if(Character.isLowerCase(s.charAt(0))) {
            System.out.println('a');
        }else{
            System.out.println('A');
        }
//        for (int i = 0; i < t; i++) {
//            int a = scan.nextInt();
//            scase();
//        }
    }


//    static void solveCase(int t, int x, String s) {
//
//    }

    static void scase() {

    }


    public static void main(String[] args) {

        solve();
        //        Main m = new Main();
        //        Scanner scan = new Scanner(System.in);

        //        long n = scan.nextLong();
        //        long r = scan.nextLong();
        //        List<Long> list = new ArrayList<>();
        ////        int[] arr = new int[n];
        //        for (long i=0;i<n;i++){
        //            list.add(scan.nextLong());
        //        }
//            System.out.println(ch);
        //        solve(n, arr);
        //        scan.close();
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


//    static class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode(int x) {
//            val = x;
//        }
//    }

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