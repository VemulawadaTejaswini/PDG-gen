import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();
        boolean res = true;
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i) != T.charAt(i)) res = false;
        }
        if(res){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}