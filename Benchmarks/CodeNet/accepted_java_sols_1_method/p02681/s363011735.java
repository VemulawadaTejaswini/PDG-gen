import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        String S = sn.next();
        String T = sn.next();
        
        if(S.length() == T.length()-1){
            if(S.equals(T.substring(0, S.length()))){
                System.out.println("Yes");
            }else{System.out.println("No");}
        }else{System.out.println("No");}
    }
}