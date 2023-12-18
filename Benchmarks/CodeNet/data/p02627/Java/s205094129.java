import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        String str = scanner.next();
        char S = str.charAt(0);
        
        if(Character.isUpperCase(S)){
            System.out.println("A");
        }else{
            System.out.println("a");
        }
        
        
    }
}
