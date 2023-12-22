import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if (isUpperCase(a)) {
            System.out.println("A");
        } else {
            System.out.println("a");
        }
    }
}
