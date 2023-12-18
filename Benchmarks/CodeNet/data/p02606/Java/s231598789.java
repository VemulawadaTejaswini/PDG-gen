import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), false);
        String s[] = br.readLine().trim().split(" ");
        int l = Integer.parseInt(s[0]);
        int r = Integer.parseInt(s[1]);
        int d = Integer.parseInt(s[2]);
        
        int f = (l/d)*d;
        int cnt=0;
        while(f<=r){
            if(f>=l) cnt++;
            f+=d;
        }
        out.println(cnt);
        
        br.close();out.flush();out.close();
    }
}