import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i = 0;i<s.length();i++){
            char a = s.charAt(i);
            if(a == 'U' || a == 'D'){
                continue;
            }else if(a == 'R' && i % 2 == 0){
                continue;
            }else if(a == 'L' && i % 2 == 1){
                continue;
            }else{
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        sc.close();
    }
}