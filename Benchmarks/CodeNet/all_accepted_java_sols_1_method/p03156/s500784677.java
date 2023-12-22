import java.util.*;
import java.io.*;
 
import static java.lang.System.in;
 
public class Main {
    static long mod = 1000000000+7;
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        int[] p = new int[n];
        for(int i=0;i<n;i++) p[i]=sc.nextInt();
        int left = 0, mid = 0, right = 0;
        for(int w:p){
            if(w<=a) left++;
            else if(w>=b+1) right++;
            else mid++;
        }
        int ans = Math.min(left,Math.min(mid,right));
        System.out.println(ans);
    }
}