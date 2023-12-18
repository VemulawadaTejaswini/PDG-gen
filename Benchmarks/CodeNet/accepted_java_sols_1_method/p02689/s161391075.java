import java.io.*;
        import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        s = in.readLine().split(" ");
        int[] h = new int[N];
        for(int i = 0; i < N; i++) {
            h[i] = Integer.parseInt(s[i]);
        }
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        HashSet<Integer> dead = new HashSet<>();
        while(M-- > 0) {
            s = in.readLine().split(" ");
            int A = Integer.parseInt(s[0]);
            int B = Integer.parseInt(s[1]);
            if(h[A - 1] > h[B - 1]) {
                dead.add(B);
            } else if(h[B - 1] > h[A - 1]) {
                dead.add(A);
            } else {
                dead.add(A);
                dead.add(B);
            }
            if(map.containsKey(A)) {
                if(map.get(A).contains(B)) {
                    //dead.add(A);
                    //dead.add(B);
                    map.remove(A);
                    map.remove(B);
                } else {
                    map.get(A).add(B);
                    if(map.containsKey(B)) {
                        map.get(B).add(A);
                    } else {
                        HashSet<Integer> set = new HashSet<>();
                        set.add(A);
                        map.put(B, set);
                    }
                }
            } else {
                HashSet<Integer> set = new HashSet<>();
                set.add(B);
                map.put(A, set);
                set = new HashSet<>();
                set.add(A);
                map.put(B, set);
            }
        }
        System.out.println(N - dead.size());

    }

}
