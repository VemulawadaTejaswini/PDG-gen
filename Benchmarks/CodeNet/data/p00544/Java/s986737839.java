import java.util.Scanner;

//0621 2016
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        int[][] c = new int[h][3];
        for (int i = 0; i < h; i++) {
            char[] l = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                if (l[j] == 'W')
                    c[i][0]++;
                else if (l[j] == 'B')
                    c[i][1]++;
                else
                    c[i][2]++;

            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < h; i++) {
            for (int j = i + 1; j < h - 1; j++) {
                int t = 0;
                for (int k = 0; k < h; k++) {
                    if (k <= i)
                        t += w - c[k][0];
                    else if (k <= j)
                        t += w - c[k][1];
                    else
                        t += w - c[k][2];
                }
                min = Math.min(min, t);
            }
        }
        System.out.println(min);
    }
}

