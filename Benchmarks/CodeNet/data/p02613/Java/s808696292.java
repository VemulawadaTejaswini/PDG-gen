
import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        //AC x 3
        //WA x 1
        //TLE x 2
        //RE x 0
        System.out.println("AC x "+map.getOrDefault("AC", 0));
        System.out.println("WA x "+map.getOrDefault("WA", 0));
        System.out.println("TLE x "+map.getOrDefault("TLE", 0));
        System.out.println("RE x "+map.getOrDefault("RE", 0));

    }

    private static boolean ok(int k) {
        while (k>0) {
            int c = k%10;
            if (c!=4&&c!=7) return false;
            k/=10;
        }
        return true;
    }

    // 1 2 3 4 5 6
    // x * 2 == 10



    private static boolean preSum(int[] nums, int target) {
        int cur = 0;
        Set<Integer> set = new HashSet<>();
        set.add(0);
        for (int i = 0; i < nums.length; i++) {
            cur += nums[i];
            if (set.contains(cur-target)) {
                System.out.println(cur-target);
                return true;
            }
            set.add(cur);
        }
        return false;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }

}

