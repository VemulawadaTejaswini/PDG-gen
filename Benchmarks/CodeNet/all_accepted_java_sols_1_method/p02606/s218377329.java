import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int l = scn.nextInt();
        int r = scn.nextInt();
        int d = scn.nextInt();
        int count = 0;

        for (int i = l; i <= r; i++) {
            if (i % d == 0) {
                count += 1;
            }
        }

        System.out.println(count);


        scn.close();

    }


}
