import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String b = sc.next();
        if (b.equals("A")) {
            System.out.println("T");
        }
        if (b.equals("T")) {
            System.out.println("A");
        }
        if (b.equals("G")) {
            System.out.println("C");
        }
        if (b.equals("C")) {
            System.out.println("G");
        }
    }
}
