import java.util.Scanner;


public class Main {

    static void solve() {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scan.nextInt();
        }
        long stocks = 0;
        long cash = 1000;
        int max = 0;
        if(prices[0] < prices[1]) {
            //buy
            stocks += (cash/prices[0]);
            cash = cash - stocks*prices[0];
        }
        for(int i=1;i<prices.length-1;i++) {
            if(prices[i] > prices[i-1] && prices[i+1] <= prices[i]){
                //sell
                cash+=prices[i]*stocks;
                stocks = 0;
            } else if(prices[i] < prices[i-1] && prices[i+1] >= prices[i]) {
                //buy
                stocks += (cash/prices[i]);
                cash = cash - stocks*prices[i];
            }
        }
        cash+=stocks*prices[prices.length-1];
        System.out.println(cash);
       // return ans;


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