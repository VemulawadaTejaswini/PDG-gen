/*
    Those who cannot remember the past are condemned to repeat it.
                                            - Dynamic Programming
    
    I never lose, I either win or I learn.
                - Competitive Programming

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);

        long[] pre = new long[1001];

        for(int i=1 ; i<=1000 ; i++) pre[i] = i + pre[i-1];

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<n ; i++) a[i] = Integer.parseInt(st.nextToken());

        double sum = 0;
        double ans = 0;
        for(int i=0 ; i<k ; i++) {
            sum += (double)pre[a[i]]/a[i];
        }

        ans = Math.max(sum, ans);

        for(int i=k ; i<n ; i++) {
            sum -= (double)pre[a[i-k]]/a[i-k];
            sum += (double)pre[a[i]]/a[i];
            ans = Math.max(sum, ans);
        }

        pw.println(ans);


        
        
        
        
        
        
        
        pw.flush();
        pw.close();
    }
}
