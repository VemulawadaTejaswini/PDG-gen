import java.io.*;
//import java.util.*;

/**
 * Created by Ayushi on 30 May 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        //StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        br.close();
        //a = a.replace("?", "D");
        //int ans = (a.charAt(a.length()-1) == 'D' ? 1:0);
        //a = a.replace("P?", "PD");
        a = a.replace("?D", "PD");
        a = a.replace("??", "PD");
        a = a.replace("?", "D");
        /*for (int i = 0; i < a.length()-1; i++) {
            //if ((a.charAt(i) == 'P' && a.charAt(i+1) == 'D') || a.charAt(i) == 'D') ans++;
            if (a.charAt(i) == '?') {

            }
            else if (a.charAt(i) == 'P') {

            }
        }*/
        System.out.println(a);
        //System.out.println(ans);
    }
}
