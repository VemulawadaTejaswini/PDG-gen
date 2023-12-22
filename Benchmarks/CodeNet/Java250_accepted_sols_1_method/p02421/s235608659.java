import java.util.Scanner;

/**
 * Card Game
 */
public class Main {
    private static final int WIN = 3;
    private static final int DRAW = 1;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count[] = new int[2];   // 太郎[0]と花子[1]のポイントカウンター
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int point = scan.next().compareToIgnoreCase(scan.next());
            if (point > 0) {
                count[0] += WIN;
            } else if (point < 0){
                count[1] += WIN;
            } else {
                count[0] += DRAW;
                count[1] += DRAW;
            }
        }
        System.out.println(count[0] + " " + count[1]);
    }
}