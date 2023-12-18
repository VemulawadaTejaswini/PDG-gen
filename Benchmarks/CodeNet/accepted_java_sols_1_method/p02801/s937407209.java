import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC151A - Next Alphabet

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        
        char[] c = s.toCharArray();
        
        c[0] += 1;

        System.out.println(String.valueOf(c[0]));
    }
}