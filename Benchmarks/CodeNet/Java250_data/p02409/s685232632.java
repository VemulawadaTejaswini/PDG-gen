import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] officialHouses = new int[4][3][10];

        int n = sc.nextInt();
 
        while (n-- > 0) {
            int b = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int v = sc.nextInt();

            officialHouses[b-1][f-1][r-1] += v;
        }

        for (int b = 0; b < 4; b++) {
            for (int f = 0; f < 3; f++) {
                for (int r = 0; r < 10; r++) {
                    System.out.print(' ');
                    System.out.print(officialHouses[b][f][r]);
                }
                System.out.println();
            }
            if (b < 4-1)
                System.out.println("####################");
        }
    }
}

