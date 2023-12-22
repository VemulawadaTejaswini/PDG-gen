import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();
        int p = sc.nextInt();
        String t = sc.next();
        char[] c = t.toCharArray();
        int now = 0;
        long ans = 0;
        while(true){
            int tmp = t.indexOf("r",now);
            if(tmp == -1){
                break;
            }else if(tmp-k >= 0 && c[tmp-k] == 'r'){
                c[tmp] = 'd';
            }else{
                ans += p;
            }
            now = tmp+1;
        }
        now = 0;
        while(true){
            int tmp = t.indexOf("p",now);
            if(tmp == -1){
                break;
            }else if(tmp-k >= 0 && c[tmp-k] == 'p'){
                c[tmp] = 'd';
            }else{
                ans += s;
            }
            now = tmp+1;
        }
        now = 0;
        while(true){
            int tmp = t.indexOf("s",now);
            if(tmp == -1){
                break;
            }else if(tmp-k >= 0 && c[tmp-k] == 's'){
                c[tmp] = 'd';
            }else{
                ans += r;
            }
            now = tmp+1;
        }
        System.out.println(ans);
    }
}

