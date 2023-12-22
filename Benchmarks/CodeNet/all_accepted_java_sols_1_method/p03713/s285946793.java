
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         PrintWriter out = new PrintWriter(System.out);
         int w = Integer.parseInt(sc.next());
         int h = Integer.parseInt(sc.next());
         long ans = 1000000000;
         if(w%3 == 0 || h%3 == 0)
         {
             ans = 0;
         }
         ans = Math.min(ans, w);
         ans = Math.min(ans, h);
         {
             int tmp = w/3;
             if(w%3==2){
                 tmp += 1;
             }
             long tmp_max = (long)tmp*(long)h;
             long tmp_min = (long)tmp*(long)h;
             tmp = w-tmp;
             if(h%2==0)
             {
                 tmp_max = Math.max(tmp_max, (long)tmp*(long)h/2l);
                 tmp_min = Math.min(tmp_min, (long)tmp*(long)h/2l);
             }
             else{
                 tmp_max = Math.max(tmp_max, (long)tmp*((long)h/2l+1l));
                 tmp_min = Math.min(tmp_min, (long)tmp*((long)h/2l));
             }
             ans = Math.min(ans, tmp_max-tmp_min);
         }
         {
             int tmp = h/3;
             if(h%3==2){
                 tmp += 1;
             }
             long tmp_max = (long)tmp*(long)w;
             long tmp_min = (long)tmp*(long)w;
             tmp = h-tmp;
             if(w%2==0)
             {
                 tmp_max = Math.max(tmp_max, (long)tmp*(long)w/2l);
                 tmp_min = Math.min(tmp_min, (long)tmp*(long)w/2l);
             }
             else{
                 tmp_max = Math.max(tmp_max, (long)tmp*((long)w/2l+1l));
                 tmp_min = Math.min(tmp_min, (long)tmp*((long)w/2l));
             }
             ans = Math.min(ans, tmp_max-tmp_min);
         }

         out.println(ans);
         out.flush();
         sc.close();
     }

}
