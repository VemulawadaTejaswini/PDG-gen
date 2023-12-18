import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Main {


    static void solve() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scan.nextInt();
        }
        if(n==1) {
            System.out.println(0);
            return;
        }
        int cnt = 0;
        Arrays.sort(arr);
        if(arr[0] != arr[1]) {
            cnt++;
        }

//        Map<Integer, Integer>map = new HashMap<>();
        Set<Integer>factors = new HashSet<>();
        Set<Integer>visited = new HashSet<>();
        visited.add(arr[0]);
        for(int j=arr[0]*2; j<=1000000;j+=arr[0]){
            factors.add(j);
        }
        for(int i=1;i<arr.length;i++) {
            if(visited.contains(arr[i])) {
                continue;
            }
            visited.add(arr[i]);
            for(int j=arr[i]*2; j<=1000000;j+=arr[i]){
                factors.add(j);
            }

            if(!factors.contains(arr[i])) {
                cnt++;
            }
            factors.add(arr[i]);
        }

        System.out.println(cnt);
//        for (int i = 0; i < t; i++) {
//            int n = scan.nextInt();
//
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