import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] li = new int[n];
        int ans = 0;
        int prev = 0;
        int now = 0;
        for(int i = 0; i < n-1; i++){
            prev = now;
            now = sc.nextInt();
            if(i == 0){
                li[i] = now;
            }else{
                li[i] = Math.min(prev,now);
            }
        }
        li[n-1] = now;
        for(int i : li) ans += i;
        System.out.println(ans);
    }
}