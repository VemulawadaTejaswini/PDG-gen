import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (y%2 == 1) {
            System.out.println("No");
            return;
        }

        if (x * 2 <= y && x * 4 >= y) {
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }



        sc.close();
    }

}