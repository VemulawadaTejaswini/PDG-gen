import java.util.*;
import java.math.*;

public class Main {

    static long MOD = 1000000007;



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean hoge = false;  
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == s.charAt(i + 1)) hoge = true;
        }
        System.out.println(hoge?"Bad":"Good");

    }
}