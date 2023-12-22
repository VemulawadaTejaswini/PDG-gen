import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String _s = s.toLowerCase();
        boolean f = (s.charAt(0) == 'A');
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'C'){
                if(i <= 1 || i == s.length()-1){
                    f = false;
                }
                cnt++;
            }else{
                if(i != 0){
                    f = f & (s.charAt(i) == _s.charAt(i));
                }
            }
        }
        f = f & (cnt == 1);
        System.out.println(f?"AC":"WA");
        sc.close();
    }
}

class io{
    public static void br(){
        System.out.println("");
    }

    public static void YesNo(boolean f) {
        System.out.println(f?"Yes":"No");
    }
    public static void YESNO(boolean f) {
        System.out.println(f?"YES":"NO");
    }

}

class Algo{
    public static boolean isOdd(int n){
        return n % 2 == 1;
    }
    public static boolean isEven(int n){
        return n % 2 == 0;
    }


}

