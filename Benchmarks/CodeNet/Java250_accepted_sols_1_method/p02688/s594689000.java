import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 03 May 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            arr.add(String.valueOf(i));
        }
        String a;
        for (int j = 0; j < k; j++) {
            int d = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                a = st.nextToken();
                arr.remove(a);
            }
        }
        br.close();
        System.out.println(arr.size());
    }
}
