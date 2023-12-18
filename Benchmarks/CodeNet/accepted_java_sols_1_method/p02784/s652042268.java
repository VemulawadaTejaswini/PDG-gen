/*
    Those who cannot remember the past are condemned to repeat it.
                                            - Dynamic Programming
    
    I never lose, I either win or I learn.
                - Competitive Programming

*/

import javax.print.DocFlavor;
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
        int h = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        long sum = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<n ; i++) {
            sum += Integer.parseInt(st.nextToken());
        }

        if(h <= sum) {
            pw.println("Yes");
        }
        else {
            pw.println("No");
        }
        
        
        
        
        
        
        
        pw.flush();
        pw.close();
    }
}
