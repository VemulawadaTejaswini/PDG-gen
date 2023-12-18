import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        String result = new String();
        for(int i = 0;i<s.length();i++){
            result = result.concat(String.valueOf(s.charAt(i)));
            result = result.concat(String.valueOf(t.charAt(i)));
        }
        System.out.println(result);
        sc.close();
    }
}
