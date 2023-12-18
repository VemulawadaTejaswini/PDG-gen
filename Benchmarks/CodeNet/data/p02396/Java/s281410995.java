import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 0;

        while (n != 0) {
                    i = i+1;
            System.out.println("Case " + i + ": " + n);
            n = scn.nextInt();
        }

    }
}

