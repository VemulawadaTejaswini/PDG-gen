import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String s = bf.readLine();
        ArrayList<Integer> counts = new ArrayList<Integer>();
        int count = 0;
        char lastchar = '!';
        for(int i=0; i<s.length(); i++) {
          if(s.charAt(i) == lastchar) {
            i++;
            lastchar = '!';
            if(i!= s.length())count++;
          }
          else {
            lastchar = s.charAt(i);
            count++;
          }
        }
        out.println(count);
        // int n = Integer.parseInt(bf.readLine());
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        // int n = Integer.parseInt(st.nextToken());

        out.close(); System.exit(0);
    }
}
