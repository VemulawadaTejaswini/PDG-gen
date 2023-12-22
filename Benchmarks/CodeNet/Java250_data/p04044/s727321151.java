import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        String[] s = new String[n];
        for(int i = 0; i < n; i++){
            s[i] = sc.next();
        }
        Arrays.sort(s);
        StringBuilder sd = new StringBuilder();
        for(String v: s){
            sd.append(v);
        }
        System.out.println(sd.toString());
    }
}