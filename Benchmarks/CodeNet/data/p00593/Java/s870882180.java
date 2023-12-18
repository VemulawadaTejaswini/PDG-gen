import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> primeList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count=0;
        while (true) {
            int n = ip(br);
            if (n == 0) {
                break;
            }
            count++;
            int[] cList = new int[2 * n - 1];
            int[] aList = new int[2 * n - 1];
            int[] bList = new int[2 * n - 1];
            for (int i = 0; i < aList.length; i++) {
                cList[i] = i < n ? i + 1 : cList[i - 1] - 1;
                aList[i] = i < n ? i : n - 1;
                bList[i] = i < n ? 0 : i % n + 1;
            }
            int[][] list = new int[2][n * n];
            int k = 0;
            for (int i = 0; i < 2 * n - 1; i++) {
                for (int j = 0; j < cList[i]; j++, k++) {
                    list[i % 2][k] = aList[i]--;
                    list[(i + 1) % 2][k] = bList[i]++;
                }
            }
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n * n; i++) {
                matrix[list[0][i]][list[1][i]] = i+1;
            }
            System.out.println("Case "+count+":");
            for(int i=0;i<n;i++){
                System.out.print(" ");
                for(int j=0;j<n;j++){
                    System.out.printf("%2d ",matrix[i][j]);
                }
                System.out.println();
            }

        }

    }

    private static int[] ai(BufferedReader br) throws IOException {
        String[] lines;

        lines = br.readLine().split(" ");
        int a = lines.length;
        int[] l = new int[a];
        while (a-- > 0) {
            l[a] = Integer.parseInt(lines[a]);
        }
        return l;
    }

    static int ip(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }

}