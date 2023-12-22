import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int max = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int p = sc.nextInt();
            if(max > p){
                ans++;
                max = p;
            }
        }
        System.out.println(ans);
    }
}