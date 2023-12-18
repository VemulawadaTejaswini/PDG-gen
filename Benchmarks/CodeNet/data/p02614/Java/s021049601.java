import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {

            String[] str = reader.readLine().split("¥s");
            int Hrow = Integer.parseInt(str[0]);
            int Wcol = Integer.parseInt(str[1]);
            int Kcnt = Integer.parseInt(str[2]);
            // int[] nums = { Integer.parseInt(str[0]), Integer.parseInt(str[1]),
            // Integer.parseInt(str[2]) };
            // 0:行H 1:列W 2:黒マスの残数K

            // H行W列の配列
            int[][] HWC = new int[Hrow][Wcol];
            // int Kcnt = 0;
            int answer = 0; // 答え 何通りあるか

            for (int i = 0; i < Hrow; i++) {
                String read = reader.readLine();
                for (int j = 0; j < Wcol; j++) {
                    if (read.charAt(j) == '#') {
                        HWC[i][j] = 1;
                    } else {
                        HWC[i][j] = 0;
                    }
                }
            }
            reader.close();
            for (int Hmask = 0; Hmask <= ((1 << Hrow) - 1); Hmask++) {
                for (int Wmask = 0; Wmask <= ((1 << Wcol) - 1); Wmask++) {
                    int Black_cnt = 0;
                    for (int i = 0; i < Hrow; i++) {
                        for (int j = 0; j < Wcol; j++) {
                            if ((((Hmask >> i) & 1) == 0) && (((Wmask >> j) & 1) == 0) && (HWC[i][j] == 1))
                                Black_cnt++;
                        }
                    }
                    if (Black_cnt == Kcnt) {
                        answer++;
                    }

                }
            }

            System.out.println(answer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
