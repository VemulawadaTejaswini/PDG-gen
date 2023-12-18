import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int now = 0;
        int chain = 0;
        for(int i = 0; i < n; i++){
            int h = sc.nextInt();
            if(now < h){
                ans = Math.max(ans,chain);
                chain = 0;
            }else{
                chain++;
            }
            now = h;
        }
        System.out.println(Math.max(ans,chain));
    }
}
 