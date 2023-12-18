import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.printf("%d %d %6f%n", a/b, a%b, (double) a/(double) b);
    }
}