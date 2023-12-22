import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        
        int a = x/500;
        int b = x%500/5;
        
        int h = 1000*a + 5*b;
        System.out.println(h);
    }
}
