import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();

        int motoAji = 0;
        int min = l;
        int minAbs = Math.abs(l);
        for (int i = 1; i < n; i++) {
            int current = l + i;
            int currentAbs = Math.abs(current);
            if (minAbs > currentAbs) {
                minAbs = currentAbs;
                min = current;
            }
        }
        for (int i = 0; i < n; i++) {
            motoAji += (l + i);
        }
        System.out.println(motoAji - min);
    }
}
