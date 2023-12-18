import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int H = Integer.parseInt(line.split(" ")[0]);
        int W = Integer.parseInt(line.split(" ")[1]);

        String[][] craymore = new String[H][W];
        int count = 0;
        while (sc.hasNext()) {
            craymore[count] = sc.nextLine().split("");
            count++;
        }

        sc.close();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < H; i++) {
            sb.setLength(0);
            for (int j = 0; j < W; j++) {
                if (craymore[i][j].equals("#")) {
                    sb.append("#");
                    continue;
                }
                int mineCount = 0;
                for (int k = -1; k <= 1; k++) {
                    if (i + k < 0 || i + k >= H) {
                        continue;
                    }
                    for (int l = -1; l <= 1; l++) {
                        if (j + l < 0 || j + l >= W || (k == l && k == 0)) {
                            continue;
                        }

                        if (craymore[i + k][j + l].equals("#")) {
                            mineCount++;
                        }

                    }
                }
                sb.append(mineCount);
            }
            System.out.println(sb.toString());
        }
    }
}