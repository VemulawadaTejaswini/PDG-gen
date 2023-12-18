import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        while (scanner.hasNext()) {
            a += scanner.nextInt();
        }
        int x = a / 60;
        int y = a % 60;
        System.out.println(x);
        System.out.println(y);
    }
}
