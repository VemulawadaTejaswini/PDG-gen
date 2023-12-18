import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        
        System.out.println((int)(a/b) + " " + (int)(a%b) + " " + String.format("%.5f",a/b));
        
    }
}

