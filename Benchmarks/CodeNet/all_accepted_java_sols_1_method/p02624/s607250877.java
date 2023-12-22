import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine().trim());
        long a[] = new long[n+1];
        Arrays.fill(a, 1);
        a[0]=0;
        for(int i=2;i<=n;i++){
            for(int j=i;j<=n;j+=i){
                a[j]++;
            }
        }
        for(int i=1;i<=n;i++){
            a[i] *= i;
            a[i] += a[i-1];
        }
        out.println(a[n]);
        out.flush();
    }
}