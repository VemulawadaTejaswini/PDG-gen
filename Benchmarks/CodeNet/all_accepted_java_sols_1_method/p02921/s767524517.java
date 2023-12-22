import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int result = 0;
        for(int i = 0;i<3;i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(c1 == c2){result++;}
        }
        System.out.println(result);
        sc.close();
    }
}