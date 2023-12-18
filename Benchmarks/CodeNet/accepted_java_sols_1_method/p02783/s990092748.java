import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int a = scan.nextInt();
        if (h % a == 0) {
            System.out.println(h / a);
        } else {
            System.out.println(h / a + 1);
        }
    }
}
