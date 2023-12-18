import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int ans = 0;
        for(int i = 0; i < s.length/2; i++){
            if(s[i] != s[s.length-i-1]){
                ans++;
            }
        }
        System.out.println(ans);
    }
}

