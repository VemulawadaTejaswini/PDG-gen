import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final String S = sc.next();
        
        System.out.println(S.endsWith("s") ? S + "es" : S + "s");
    }
}
