import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int area = x * y;
        int length = 2 * (x+y);

        System.out.print(area);
        System.out.print(" ");
        System.out.println(length);
    }
}
