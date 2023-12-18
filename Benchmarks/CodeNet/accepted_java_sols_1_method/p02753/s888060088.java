import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.nextLine();

        if ("AAA".equals(a) || "BBB".equals(a)) {

            System.out.println("No");


        } else {
            System.out.println("Yes");
        }

    }
}