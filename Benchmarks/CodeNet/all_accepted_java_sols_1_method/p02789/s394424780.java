

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello Java");
        Scanner sc = new Scanner(System.in);

        if (sc.next().equals(sc.next())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}