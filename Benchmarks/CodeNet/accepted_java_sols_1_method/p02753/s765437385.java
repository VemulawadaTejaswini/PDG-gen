import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] c = s.toCharArray();
        char tmp = c[0];
        boolean f = false;
        for(char tc : c){
            if(tc != tmp)f=true;
            tmp = tc;
        }
        if(f){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}