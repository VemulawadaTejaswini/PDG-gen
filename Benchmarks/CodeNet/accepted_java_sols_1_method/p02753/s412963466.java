

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();

        if (a.contains("A") && a.contains("B")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scan.close();

    }

}