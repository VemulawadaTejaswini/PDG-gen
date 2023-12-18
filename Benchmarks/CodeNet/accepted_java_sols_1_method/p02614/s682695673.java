import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int H = s.nextInt();
        int W = s.nextInt();
        int K = s.nextInt();
        int count = 0;

        char[][] c = new char[H][W];

        for (int i = 0; i < H; i++) {
            c[i] = s.next().toCharArray();
        }

        int x = (int) Math.pow(2, H + W);
        boolean[] bool = new boolean[H + W];

        for (int i = 0; i < x; i++) {
            int temp = i;
            for (int j = 0; j < H + W; j++) {
                bool[j] = temp % 2 != 0;
                temp /= 2;
            }

            int blackCount = 0;

            for (int k = 0; k < H; k++) {
                for (int l = 0; l < W; l++) {
                    if(bool[k] && bool[l + H]){
                        if(c[k][l] == '#') blackCount++;
                    }
                }
            }

            if(K == blackCount) count++;
        }

        System.out.println(count);
    }
}