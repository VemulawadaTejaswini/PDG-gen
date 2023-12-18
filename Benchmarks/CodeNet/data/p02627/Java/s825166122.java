import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        switch (s) {
            case "A":
                System.out.println("A");
                break;
            case "a":
                System.out.println("a");
                break;
            default:
                System.out.println("A");
                break;
        }

    }
}