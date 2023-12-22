import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1){System.out.println(1);return;}
        String s = sc.next();
        int result = 1;
        char a = s.charAt(0);
        for(int i = 1;i<n;i++){
            if(a != s.charAt(i)){
                result++;
                a = s.charAt(i);
            }
        }
        System.out.println(result);
        sc.close();
    }
}