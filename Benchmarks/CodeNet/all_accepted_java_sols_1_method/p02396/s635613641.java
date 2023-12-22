import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int i = 0;
        while ((x = scanner.nextInt()) != 0) {
            System.out.println("Case "+(++i)+": "+x);
        }
    }
}
