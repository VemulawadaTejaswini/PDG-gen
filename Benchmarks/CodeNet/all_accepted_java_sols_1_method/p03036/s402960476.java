import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int d = input.nextInt();
        int x = input.nextInt();
        int result = 0;

        for (int i = 0; i < 10; i++) {
            result = (r*x)-d;
            System.out.println(result);
            x = result;

        }
    }

}
