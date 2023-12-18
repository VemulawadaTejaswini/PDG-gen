import java.util.*;

public class Main {


    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int d = scan.nextInt();
        int t = scan.nextInt();
        int s = scan.nextInt();

        if (s* t >= d) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }
    }

}