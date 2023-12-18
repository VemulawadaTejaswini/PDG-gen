

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if ("Sunny".equals(s)) {
            System.out.println("Cloudy");
        } else if ("Cloudy".equals(s)) {
            System.out.println("Rainy");
        } else if ("Rainy".equals(s)) {
            System.out.println("Sunny");
        }

        sc.close();
    }
}