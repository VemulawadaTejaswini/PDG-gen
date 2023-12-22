import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int k = stdIn.nextInt();
        ArrayList<Long> hitPoint = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            hitPoint.add(stdIn.nextLong());
        }

        Collections.sort(hitPoint);

        long attack = 0;
        for (int i = 0; i < n - k; i++) {
            attack += hitPoint.get(i);
        }

        System.out.println(attack);
    }
}
