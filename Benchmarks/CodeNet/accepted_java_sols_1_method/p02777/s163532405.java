import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String u = scanner.next();

        if (u.equals(s)){
            System.out.println((a-1) + " " + b);
        }
        else {
            System.out.println(a + " " + (b-1));
        }
    }
}
