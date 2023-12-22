import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();

        while ((x != 0) || (y != 0)) {
            if (x < y) {
                System.out.println(x + " " + y);
            }else{
                System.out.println(y + " " + x);
            }
            x = scn.nextInt();
            y = scn.nextInt();
        }

    }
}
