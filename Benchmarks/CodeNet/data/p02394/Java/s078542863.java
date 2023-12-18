import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int w = scn.nextInt();
        int h = scn.nextInt();
        int x = scn.nextInt();
        int y = scn.nextInt();
        int r = scn.nextInt();

        boolean ans1 = (x >= r) && (y >= r);
        boolean ans2 = ((w - x) >= r) && ((h - y) >= r);

        if ((ans1 == true) && (ans2 == true)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        scn.close();
    }
}
