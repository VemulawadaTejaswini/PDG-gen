
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        boolean f = false;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)){
                System.out.println((i+1) +" " + (i+2));
                f= true;
                break;
            }
            
        }
        if (f==false){
        for (int i = 0; i < s.length()-2; i++) {
            if (s.charAt(i) == s.charAt(i+2)){
                System.out.println((i+1) +" " + (i+3));
               f = true;
                break;
                
            }
        }
        }
        if (f==false)
            System.out.println("-1 -1");
    }

}
