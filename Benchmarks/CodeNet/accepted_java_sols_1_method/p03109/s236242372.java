

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String [] date = s.split("/");
        if (Integer.valueOf(date[1]) > 4) {
            System.out.println("TBD");
        } else {
            System.out.println("Heisei");
        }
    }
}
