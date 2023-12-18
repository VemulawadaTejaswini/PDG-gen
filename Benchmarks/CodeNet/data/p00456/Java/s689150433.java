import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int[] w = new int[10];
            for(int i = 0; i < 10; i++) {
                w[i] = scn.nextInt();
            }
            Arrays.sort(w);

            int[] k = new int[10];
            for(int i = 0; i < 10; i++) {
                k[i] = scn.nextInt();
            }
            Arrays.sort(k);

            System.out.print(w[9] + w[8] + w[7] + " ");
            System.out.println(k[9] + k[8] + k[7]);
        }
    }
}