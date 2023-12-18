import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final String S = sc.next();
        final String T = sc.next();
        
        long diff = IntStream.range(0, S.length())
                .filter(i -> S.charAt(i) != T.charAt(i))
                .count();
        
        System.out.println(diff);
    }
}
