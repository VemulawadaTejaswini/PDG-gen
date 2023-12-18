import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int now = 0;
        int ans = 0;
        for(char c : s){
            if(c == 'I'){
                now++;
                ans = Math.max(ans,now);
            }else{
                now--;
            }
        }
        System.out.println(ans);
    }
}