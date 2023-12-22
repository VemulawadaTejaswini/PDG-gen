import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Boolean a = str.charAt(2) == (str.charAt(3));
        Boolean b = str.charAt(4) == (str.charAt(5));
        if(a && b) System.out.println("Yes");
        else System.out.println("No");
    }
}
