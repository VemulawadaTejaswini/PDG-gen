import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int[] h = new int[n];
        if(n==1){
            System.out.println(0);
            return;
        }
        for(int i = 0;i<n;i++){
            h[i] = sc.nextInt();
        }
        int now = h[n-1];
        int nowResult = 0;
        for(int i = (n-2);i>-1;i--){
            int tugi = h[i];
            if(tugi >= now){
                nowResult++;
                if(result<nowResult){
                    result = nowResult;
                }
            }else{
                nowResult = 0;
            }
            now = tugi;
        }
        System.out.println(result);
        sc.close();
    }
}