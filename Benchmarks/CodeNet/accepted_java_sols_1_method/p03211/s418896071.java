import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int ans = 999;
        for(int i=0;i<=S.length()-3;i++){
            int part = Integer.parseInt(S.substring(i,i+3));
            ans = Math.min(ans, Math.abs(part-753));
        }
        System.out.println(ans);
    }
}