import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int n = b - a + 1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if ((c % a) == 0) {
                count = count + 1;
            }
            a = a + 1;
        }

        System.out.println(count);


    }
}
