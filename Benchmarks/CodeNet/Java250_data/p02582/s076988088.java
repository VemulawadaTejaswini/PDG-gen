import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Arrays;
// import java.util.Random;
import java.util.StringTokenizer;

public class Main {
     public static void main(String[] args) {
         FastScanner fs=new FastScanner();
         int T=1;
         for (int tt=0; tt<T; tt++) {
                    String s = fs.next();
                    int maxc = 0;
                    int maxg = 0;
                    for(int i=0;i<s.length();i++){
                        if(s.charAt(i) == 'R'){
                            maxc++;
                            maxg = Math.max(maxc,maxg);
                        }
                        else{
                            maxc = 0;
                        }
                        
                    }
                    System.out.println(maxg);


                 }
}
 
 static class FastScanner {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     StringTokenizer st=new StringTokenizer("");
     String next() {
     while (!st.hasMoreTokens())
         try {
             st=new StringTokenizer(br.readLine());
         } catch (IOException e) {
             e.printStackTrace();
         }
         return st.nextToken();
     }
     
     int nextInt() {
         return Integer.parseInt(next());
     }
     int[] readArray(int n) {
         int[] a=new int[n];
         for (int i=0; i<n; i++) a[i]=nextInt();
         return a;
     }
     long nextLong() {
         return Long.parseLong(next());
     }
 }

 
}
