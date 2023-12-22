import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        scanner.close();
        String b = "ABC"+a;
        
        System.out.println(b);
    }
}