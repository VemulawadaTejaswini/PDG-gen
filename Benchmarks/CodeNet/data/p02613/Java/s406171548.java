import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Main {


    static void solve() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Map<String, Integer>map = new HashMap<>();
        for (int i=0;i<n;i++) {
            String s = scan.next();
            if(map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            }else{
                map.put(s, 1);
            }
        }

        if(map.containsKey("AC")) {
            String ss = "AC x " + map.get("AC");
            System.out.println(ss);
        }else{
            System.out.println("AC x 0");
        }
        if(map.containsKey("WA")) {
            String ss = "WA x " + map.get("WA");
            System.out.println(ss);
        }else{
            System.out.println("WA x 0");
        }
        if(map.containsKey("TLE")) {
            String ss = "TLE x " + map.get("TLE");
            System.out.println(ss);
        }else{
            System.out.println("TLE x 0");
        }
        if(map.containsKey("RE")) {
            String ss = "RE x " + map.get("RE");
            System.out.println(ss);
        }else{
            System.out.println("RE x 0");
        }


//        long t = scan.nextLong();

//        for (int i = 0; i < t; i++) {
//            int n = scan.nextInt();
//            int res = n%1000;
//            System.out.println(res);
////            scase(n);
//        }
    }


    static void solveCase(int t, int x, String s) {

    }

    static void scase(long n) {

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