import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String res = "No";
        if ((s.charAt(2) == s.charAt(3)) && (s.charAt(4) == s.charAt(5))) res = "Yes";
        
        System.out.println(res);
    }
}