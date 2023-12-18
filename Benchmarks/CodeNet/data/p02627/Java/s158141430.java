import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String temp = n.toUpperCase();
        if (n.equals(temp)) {
            System.out.println("A");
        } else {
            System.out.println("a");
        }
    }
}
