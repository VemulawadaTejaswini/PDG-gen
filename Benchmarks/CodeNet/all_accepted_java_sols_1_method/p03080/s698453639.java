import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        String strB = s.replaceAll("R", "");
        String strR = s.replaceAll("B", "");
        

        if (strR.length() > strB.length() )
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }

}