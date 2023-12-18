import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int area = a * b;
        int circumference = 2 * a + 2 * b;
        System.out.println(area + " " + circumference);
    }
}
