import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int posA, posB, disA, disB, time;
        posA = scan.nextInt();
        disA = scan.nextInt();
        posB = scan.nextInt();
        disB = scan.nextInt();
        time = scan.nextInt();

        while (time > 0) {
            posA += disA;
            posB += disB;

            if (posA == posB) {
                System.out.println("YES");
                return;
            }
            time--;
        }
        System.out.println("NO");

    }
}
