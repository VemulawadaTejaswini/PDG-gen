import java.util.Scanner;

/**
 * Official House
 */
public class Main {
    private static Scanner scan;
    // １フロア１０部屋、３階建ての公舎４棟
    private static final int Room = 10;
    private static final int Floor = 3;
    private static final int Building = 4;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        // n件の情報
        // b棟f階のr番目の部屋にv人
        int n = scan.nextInt();
        int[][][] count = new int[Building][Floor][Room];

        int b,f,r,v = 0;
        for (int i = 0; i < n; i++) {
            b = scan.nextInt();
            f = scan.nextInt();
            r = scan.nextInt();
            v = scan.nextInt();
            for (int p = 0; p < Building; p++) {
                for (int q = 0; q < Floor; q++) {
                    for (int x = 0; x < Room; x++) {
                        if (p + 1 == b && q + 1 == f && x + 1 == r) {
                            count[p][q][x] += v;
                        }
                    }
                }
            }
        }
        for (int p = 0; p < Building; p++) {
            for (int q = 0; q < Floor; q++) {
                for (int x = 0; x < Room; x++) {
                    System.out.print(" ");
                    System.out.print(count[p][q][x]);
                }
                System.out.print("\n");
            }
            if (p < Building - 1) {
                System.out.println("####################");
            }
        }
    }
}