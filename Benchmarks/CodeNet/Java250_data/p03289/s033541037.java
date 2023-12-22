import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.charAt(0) != 'A'){
            System.out.println("WA");
        }else{
            int n = 0;
            for(int i = 2; i < s.length()-1; i++){
                if(s.charAt(i) == 'C'){
                    n++;
                }
            }
            if (n != 1) {
                System.out.println("WA");
            }else{
                int m = 0;
                for(int i = 1; i < s.length(); i++){
                    if(Character.isUpperCase(s.charAt(i))){
                        m++;
                    }
                }
                if (m != 1) {
                    System.out.println("WA");
                }else{
                    System.out.println("AC");
                }
            }
        }
    }
}