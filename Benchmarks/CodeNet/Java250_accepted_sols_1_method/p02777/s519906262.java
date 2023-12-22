import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.nextLine();
        String u = scanner.next();
        if (s.equals(u)) {
            System.out.println(String.valueOf(a - 1) + ' ' + String.valueOf(b));
        } else if (t.equals(u)) {
            System.out.println(String.valueOf(a) + ' ' + String.valueOf(b - 1));
        }
    }
}
