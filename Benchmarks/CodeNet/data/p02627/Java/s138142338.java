import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alpha = sc.next();
        String change = alpha.toUpperCase();
        if (alpha.equals(change)) {
            System.out.println("A");
        }else {
            System.out.println("a");
        }
    }
}
