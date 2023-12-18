import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int adivb = a/b;
        int amodb = a % b;
        double adivb_f = a / (b * 1.0);
        
        System.out.printf("%d %d %f", adivb, amodb, adivb_f);
        
    }
}
