import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][][] list = new int[4][3][10];
        for (int i = 0; i < n; i++) {
            String[] lines = br.readLine().split(" ");
            int[] nList = new int[4];
            for (int j = 0; j < 4; j++) {
                nList[j] = Integer.parseInt(lines[j]) - 1;
            }
            list[nList[0]][nList[1]][nList[2]] += nList[3] + 1;
        }
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 3; k++) {
                for (int l = 0; l < 10; l++) {
                    if (0 != list[j][k][l]) {
                        System.out.print(" " + list[j][k][l]);
                    } else {
                        System.out.print(" 0");
                    }
                }
                System.out.println();
            }
            if (j != 3) {
                System.out.println("####################");
            }
        }
    }
}