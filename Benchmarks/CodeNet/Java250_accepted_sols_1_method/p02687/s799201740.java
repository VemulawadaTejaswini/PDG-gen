import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String n = scan.nextLine();

        String anser = n.equals("ABC") ? "ARC" : "ABC";

        System.out.println(anser);
    }
}
