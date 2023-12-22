import java.util.*;
import java.io.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                PrintWriter ou = new PrintWriter(System.out);
                int n = Integer.parseInt(sc.next());
                char[] z = new char[10];
                String[] s = new String[n];
                for(int i = 0 ; i < n ; i++){
                        s[i] = sc.next();
                        for(int ii = 0 ; ii <= 9 ; ii++){
                                z[ii] = s[i].charAt(ii);
                        }
                        Arrays.sort(z);
                        s[i] = "";
                        for(int ii = 0 ; ii < 10 ; ii++){
                                s[i] += z[ii];
                        }
                }
                for(String pp : s){
                        int c = 0;
                        if(hs.containsKey(pp)) c = (int)hs.get(pp);
                        hs.put(pp , c + 1);
                }
                long[] yono = {0};
                long[] q = {0};
                hs.forEach((pp , c) -> {
                        q[0] = (int)c;
                        yono[0] += q[0] * (q[0] - 1) / 2;
                });
                ou.print(yono[0] + "\n");
                ou.flush();
        }
}