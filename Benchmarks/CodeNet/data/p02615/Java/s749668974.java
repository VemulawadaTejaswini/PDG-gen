import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // Solution sol = new Solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++)
            a[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(a);
        long ans = a[n-1];
        int j=n-2;
        for (int i=2; i<n; i++){
            ans+=a[(int)Math.floor(j)];
            j+=0.5;
        }
        System.out.println(ans);
    }



}