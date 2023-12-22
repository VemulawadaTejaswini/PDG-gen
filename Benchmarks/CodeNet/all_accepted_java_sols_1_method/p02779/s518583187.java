/*
    Those who cannot remember the past are condemned to repeat it.
                                            - Dynamic Programming
    
    I never lose, I either win or I learn.
                - Competitive Programming

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);

        HashSet<Integer> hs = new HashSet<>();
        int n = Integer.parseInt(br.readLine());

        boolean dis = true;
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<n ; i++) {
            int x = Integer.parseInt(st.nextToken());
            if(hs.contains(x)) {
                dis = false;
                break;
            }
            else {
                hs.add(x);
            }
        }

        if(dis) pw.println("YES");
        else pw.println("NO");
        
        
        
        
        
        
        pw.flush();
        pw.close();
    }
}
