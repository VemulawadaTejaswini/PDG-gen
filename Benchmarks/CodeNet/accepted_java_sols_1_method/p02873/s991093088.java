import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int[] li = new int[s.length];
        long ans = 0;
        int chainDec = 0;
        int now = 0;
        int i = 0;
        for(char c : s){
            if(c == '<'){
                now++;
                ans += now;
                chainDec = 0;
            }else{
                chainDec++;
                if(now > 0){
                    li[i-1] = now;  
                    now = 0;
                }else{
                    if(i-chainDec >= 0 && li[i-chainDec] >= chainDec){
                        ans += chainDec-1;
                    }else{
                        ans += chainDec;
                    }
                }
            }
            i++;
        }
        System.out.println(ans);
    }
}