import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        
        if (s.length() <= k) {
            System.out.println(s);
        } else {
            System.out.print(s.substring(0, k));
            System.out.println("...");
        }
    }
}