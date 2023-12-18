
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();

        String a = "";
        for (int i = 0; i < x; i++) {
            a = a + "" + y;
        }
        String b = "";
        for (int i = 0; i < y; i++) {

            b = b + "" + x;

        }

        String[] s = {a, b};
        Arrays.sort(s);
        System.out.println(s[0]);


    }

}
