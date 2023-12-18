import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String a = sc.next();
            System.out.println(Character.isUpperCase(a.charAt(0)) ? "A" : "a");
        }
    }
}
