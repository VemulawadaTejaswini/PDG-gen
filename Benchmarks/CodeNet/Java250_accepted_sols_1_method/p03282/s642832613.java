import java.util.*;
import static java.lang.Math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        int memo = 0;
        while(s.length()>memo && s.charAt(memo)=='1'){ 
            memo++;
        }
        System.out.println(k-1<memo? '1':s.charAt(memo));
    }
}