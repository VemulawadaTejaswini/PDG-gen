import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), false);
        int n = Integer.parseInt(br.readLine().trim());
        String s[] = br.readLine().trim().split(" ");
        int cnt=0;
        for(int i=0;i<n;i++) {
            if(i%2==0){
                if(Integer.parseInt(s[i])%2==1) ++cnt;
            }
        }
        out.println(cnt);
        
        br.close();out.flush();out.close();
    }
}