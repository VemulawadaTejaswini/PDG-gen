import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();

        if (in.equals("A")) {
            System.out.println("T");
        }
        if (in.equals("T")) {
            System.out.println("A");
        }
        if (in.equals("C")) {
            System.out.println("G");
        }
        if (in.equals("G")) {
            System.out.println("C");
        }

    }

}
