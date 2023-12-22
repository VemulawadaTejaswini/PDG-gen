

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello Java");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.equals("ABC"))
            System.out.println("ARC");
        if (s.equals("ARC"))
            System.out.println("ABC");
        sc.close();
    }
}