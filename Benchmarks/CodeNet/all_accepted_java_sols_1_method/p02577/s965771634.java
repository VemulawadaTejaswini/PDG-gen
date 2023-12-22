
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final String N = sc.next();
        
        int total = N.codePoints().map(c -> c - '0').sum();
        System.out.println(total % 9 == 0 ? "Yes" : "No");
    }
}
