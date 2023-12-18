import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 10 == 2 || n % 10 == 4 || n % 10 == 5 || n % 10 == 7 || n % 10 == 9) {
            System.out.println("hon");
        } else if (n % 10 == 3) {
            System.out.println("bon");
        } else {
            System.out.println("pon");
        }

        sc.close();
    }

}
