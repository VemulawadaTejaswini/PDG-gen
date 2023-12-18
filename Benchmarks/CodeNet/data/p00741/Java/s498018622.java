import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            if (w + h == 0) {
                break;
            }
            int[][] field = new int[h+2][w+2];
            for (int i=1; i<=h; ++i) {
                for (int j=1; j<=w; ++j) {
                    field[i][j] = sc.nextInt();
                }
            }
            int counter = 0;
            for (int i=1; i<=h; ++i) {
                for (int j=1; j<=w; ++j) {
                    if (field[i][j] == 1) {
                        counter -= 1;
                        dfs(field, i, j, counter);
                    }
                }
            }
            System.out.println(counter * -1);
        }
        sc.close();
    }

    private static void dfs(int[][] field, int ifrom, int jfrom, int id) {
        field[ifrom][jfrom] = id;
        for (int i=ifrom-1; i<=ifrom+1; ++i) {
            for (int j=jfrom-1; j<=jfrom+1; j++) {
                if (field[i][j] == 1) {
                    dfs(field, i, j, id);
                }
            }
        }
    }
}

