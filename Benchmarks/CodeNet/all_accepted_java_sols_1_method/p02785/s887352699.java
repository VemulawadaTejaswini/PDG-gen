import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nm = in.nextInt();
        int moves = in.nextInt();
        int health[] = new int[nm];
        long attacks = 0;

        for (int i = 0; i < health.length; i++)
            health[i] = in.nextInt();

        if (moves < nm) {
            Arrays.sort(health);

            for (int i = 0; i < nm - moves; i++)
                attacks += (long) health[i];
        }

        System.out.println(attacks);
        in.close();
    }
}