import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = sc.next();
        if(s.length()%2==1){
            System.out.println("No");
            return;
        }
        for(int i = 0;i<(s.length()/2);i++){
            if(s.charAt(i)!=s.charAt(i+s.length()/2)){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        sc.close();
    }
}