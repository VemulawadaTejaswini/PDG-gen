import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] H = new int[N];
        int count = 0;
        int max = 0;
        for (int i = 0 ; i < N ; i++) {
            H[i] = sc.nextInt();
            if (max < H[i]) max = H[i];
        }
        int[][] HN = new int[max][N];
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < N ; j++) {
                if (0 < H[j]) {
                    HN[i][j] = 1;
                    H[j]--;
                } else HN[i][j] = 0;
            }
        }
        for (int[] line : HN) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < line.length; i++) {
                if (i == 0 && line[0] != 0) sb.append(line[i]);
                else if (0 < i && line[i] != line[i-1]) sb.append(line[i]);
                else continue;
            }
            count += sb.toString().split("0").length;
        }
        System.out.println(count);
    }
}