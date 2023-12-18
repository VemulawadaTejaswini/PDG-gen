import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.next();

        if (Integer.valueOf(n.substring(0, 3)) % 111 == 0 ||
            Integer.valueOf(n.substring(1, 4)) % 111 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
    }
}

