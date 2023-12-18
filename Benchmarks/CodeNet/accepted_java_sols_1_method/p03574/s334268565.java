import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        sc.nextLine();
        String[][] S = new String[H][W];
        for(int i=0; i<H; i++) {
			S[i] = sc.next().split("");
		}
        sc.close();

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (S[i][j].equals(".")) {
                    int count = 0;
                    for (int a = -1; a <= 1; a++) {
                        if (i + a < 0 || H <= i + a) {
                            continue;
                        }
                        for (int b = -1; b <= 1; b++) {
                            if (j + b < 0 || W <= j + b) {
                                continue;
                            }
                            if ( S[i + a][j + b].equals("#")) {
                                count++;
                            }
                        }
                    }
                    S[i][j] = String.valueOf(count);
                }
                System.out.printf("%s", S[i][j]);
            }
            System.out.printf("\n");
        }
    }
}