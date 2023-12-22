import java.io.UnsupportedEncodingException;
import java.util.*;

public class Main{
    public static void main(String[] args) throws UnsupportedEncodingException{
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        char[] c = new char[n];
        boolean b = true;
        if(n % 2 == 0){
            for(int i = 0; i < n; i++){
                c[i] = s.charAt(i);
                if(i < n / 2){
                    if(c[i] == s.charAt(i + n / 2) && b){
                        b = true;
                    }else{
                        b = false;
                    }
                }
            }
        }else{
            b = false;
        }
        if(b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}