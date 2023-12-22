import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String a = in.next(), b = in.next(), c = in.next();
        if (a.charAt(a.length()-1) == b.charAt(0) && b.charAt(b.length()-1) == c.charAt(0)){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
    
}