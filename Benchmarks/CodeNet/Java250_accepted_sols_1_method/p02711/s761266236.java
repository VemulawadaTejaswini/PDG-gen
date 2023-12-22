import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (s.charAt(0)=='7'||s.charAt(1)=='7'||s.charAt(2)=='7'){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}