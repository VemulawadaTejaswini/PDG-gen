import java.io.*;
import java.util.*;
import static java.lang.System.in;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args){
        int n = sc.nextInt(), ans = 0;
        int maxi = -1;
        for(int i=0;i<n;i++){
            int cur = sc.nextInt();
            maxi = Math.max(maxi,cur);
            if(cur==maxi) ans++;
        }
        System.out.println(ans);
    }
}