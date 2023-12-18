import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String S = sc.next();
            System.out.println(S + ((S.charAt(S.length() - 1) == 's') ? "es" : "s"));
        }
    }

}