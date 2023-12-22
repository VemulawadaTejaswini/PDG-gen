

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String alpha = sc.next();

        Character a = alpha.charAt(0);

        if (Character.isUpperCase(alpha.charAt(0))) {
            System.out.println("A");
        }else {
            System.out.println("a");
        }

    }
}
