import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = null;
        try {
            scan = new Scanner(System.in);
            String str = scan.nextLine();
            if (str != null && str.equals("ABC")) {
                System.out.println("ARC");
            } else {
                System.out.println("ABC");
            }
        } finally {
            scan.close();
        }
    }
}
