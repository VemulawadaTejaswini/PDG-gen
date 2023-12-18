import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        String S = stdIn.nextLine();
;
        
        if( S.charAt(2) != S.charAt(3) || S.charAt(4) != S.charAt(5))
            System.out.print("No");
        else
            System.out.print("Yes");
        
        
  
    }
}