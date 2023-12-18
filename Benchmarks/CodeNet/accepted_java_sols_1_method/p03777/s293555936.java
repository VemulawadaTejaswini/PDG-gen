import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String a, b;

        Scanner input = new Scanner(System.in);

        a = input.next();
        b = input.next();

        if (a.equals("H") && b.equals("H")) {

            System.out.println("H");
            
        } else if (a.equals("H") && b.equals("D")) {

            System.out.println("D");
            
        } else if (a.equals("D") && b.equals("H")) {

            System.out.println("D");
            
        } else if (a.equals("D") && b.equals("D")) {

            System.out.println("H");
        }
    }

}
