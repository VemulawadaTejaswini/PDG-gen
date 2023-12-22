import java.util.*;

public class Main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();
        
        if(T.contains(S) && S.charAt(0)==T.charAt(0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
