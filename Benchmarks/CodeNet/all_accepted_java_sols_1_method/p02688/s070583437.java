import java.io.*;
        import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < K; i++) {
            int d = Integer.parseInt(in.readLine());
            s = in.readLine().split(" ");
            for(int j = 0; j < s.length; j++) {
                set.add(Integer.parseInt(s[j]));
            }
        }
        System.out.println(N - set.size());
    }

}
