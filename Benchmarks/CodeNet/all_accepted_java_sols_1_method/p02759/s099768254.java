import java.util.*;

public class Main {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a%2 == 0) {
            System.out.println(a/2);
        }else {
            System.out.println(a/2 + a%2);
        }

    }
}