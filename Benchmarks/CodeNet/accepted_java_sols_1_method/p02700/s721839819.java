import java.util.*;
import java.util.stream.*;

public class Main {
    private static final boolean IS_TAKAHASHI_TURN = true;

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);
        int takahashiHP = sc.nextInt();
        int takahashiAP = sc.nextInt();

        int aokiHP = sc.nextInt();
        int aokiAP = sc.nextInt();

        boolean turn = IS_TAKAHASHI_TURN;
        while (takahashiHP > 0 && aokiHP > 0) {
            if (turn == IS_TAKAHASHI_TURN) {
                aokiHP = aokiHP - takahashiAP;
            } else {
                takahashiHP = takahashiHP - aokiAP;
            }
            turn = !turn;
        }
        System.out.println(takahashiHP > 0 ? "Yes" : "No");
    }
}
