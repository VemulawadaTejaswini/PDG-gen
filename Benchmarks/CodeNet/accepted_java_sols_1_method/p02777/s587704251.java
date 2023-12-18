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
        
        st = new StringTokenizer(br.readLine());
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String u = br.readLine();
        if(u.equals(s1)) {
            a--;
        }
        else {
            b--;
        }

        pw.println(a + " " + b);
        
        
        
        
        
        pw.flush();
        pw.close();
    }
}
