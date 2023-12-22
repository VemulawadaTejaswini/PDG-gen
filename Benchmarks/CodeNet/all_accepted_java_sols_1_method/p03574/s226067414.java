import java.util.*;

class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int W = in.nextInt();
        in.nextLine();

        char[][] S = new char[H][W];

        for (int i = 0; i < H; i++) {
            S[i] = in.nextLine().toCharArray();
        }

        int[] ns = {-1, 0, 1};
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (S[i][j] == '#') continue;
                int sum = 0;
                for (int k : ns) {
                    if (i + k < 0 || i + k >= H) continue;
                    for (int l : ns) {
                        if (j + l < 0 || j + l >= W) continue;
                        if (S[i + k][j + l] == '#') sum++;
                    }
                }
                S[i][j] = (char) ('0' + sum);
            }
        }

        for (int i = 0; i < H; i++)
            System.out.println(S[i]);
    }
}