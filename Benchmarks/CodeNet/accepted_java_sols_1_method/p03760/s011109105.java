import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] o = sc.next().toCharArray();
        char[] e = sc.next().toCharArray();
        boolean stop = o.length != e.length;
        String ans = "";
        for(int i = 0; i < o.length; i++){
            ans += o[i];
            if(i == o.length-1 && stop) continue;
            ans += e[i];
        }
        System.out.println(ans);
    }
}