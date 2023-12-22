
import java.util.*;

class Main {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        char[] ss = s.next().toCharArray();

        if (ss[2] != ss[3]) {
            System.out.println("No");
            return;
        }
        if (ss[4] != ss[5]) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }

}
