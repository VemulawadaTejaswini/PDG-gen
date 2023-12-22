import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String s = bf.readLine();
        int[] a = new int[s.length()];
        int n = s.length();
        for(int i=0; i<s.length(); i++) a[i] = s.charAt(i)-'a';
        Set<Integer> avail = new HashSet<Integer>();
        for(int i=0; i<n; i++) avail.add(a[i]);
        boolean done = false;
        if(n < 26) {
          StringBuilder sb = new StringBuilder();
          for(int i=0; i<n; i++) sb.append((char)('a'+a[i]));
          for(int j=0; j<26; j++) {
            if(!avail.contains(j)) {
              sb.append((char)('a'+j));
              break;
            }
          }
          out.println(sb.toString());
        }
        else {
        hi: for(int i=n-1; i>=0; i--) {
          int cur = a[i];
          avail.remove(a[i]);
          cur++;
          while((cur < 26) && (avail.contains(cur)))
            cur++;
          if(cur != 26) {
            a[i] = cur;
            avail.add(cur);
            done = true;
            break;
          }
        }

        if(!done) out.println("-1");
        else {
          StringBuilder sb = new StringBuilder();
          for(int i=0; i<avail.size(); i++) sb.append((char)('a'+a[i]));
          out.println(sb.toString());
        }
        }
        // Scanner scan = new Scanner(System.in);
        // PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        // int n = Integer.parseInt(bf.readLine());
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // int[] a = new int[n];
        // for(int i=0; i<n; i++) a[i] =  Integer.parseInt(st.nextToken());

        out.close(); System.exit(0);
    }


}
