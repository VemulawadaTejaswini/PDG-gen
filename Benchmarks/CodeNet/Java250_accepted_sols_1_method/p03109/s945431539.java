import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int number = Integer.parseInt(S.replaceAll("/", ""));
        sc.close();

        if (number > 20190430) {
            System.out.println("TBD");
        }
        else {
            System.out.println("Heisei");
        }
    }
}