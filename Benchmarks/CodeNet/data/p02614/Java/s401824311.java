import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        boolean[][] c = new boolean[h][w];
        int sumBlack = 0;
        int[] rowBlack = new int[h];
        int[] columnBlack = new int[w];
        for (int i=0; i<h; i++) {
            String cs = sc.next();
            for (int j=0; j<w; j++) {
                if ('#' == cs.charAt(j)) {
                    c[i][j] = true;
                    sumBlack++;
                    rowBlack[i]++;
                    columnBlack[j]++;
                }
            }
        }
        int removeCount = sumBlack - k;
        if (removeCount == 0) {
            System.out.println(1 + countFrom(rowBlack, 0) + countFrom(columnBlack, 0));
        } else {
            System.out.println(countAll(c, rowBlack, columnBlack, removeCount, 0));
        }

    }

    private static long countFrom(int[] target, int value) {
        return Arrays.stream(target)
                .filter(n -> n == value)
                .count();
    }

    private static int countAll(boolean[][] c, int[] rowB, int[] columnB, int remain, int done) {
        int result = 0;
        for (int i=done; i<rowB.length + columnB.length; i++) {
            if (i < rowB.length) {
                if (rowB[i] == remain) {
                    result++;
                    continue;
                }
                if (rowB[i] < remain) {
                    boolean[][] cc = new boolean[rowB.length][columnB.length];
                    for (int j=0; j<rowB.length; j++) {
                        System.arraycopy(c[j], 0, cc[j], 0, columnB.length);
                    }
                    int[] columnBc = new int[columnB.length];
                    System.arraycopy(columnB, 0, columnBc, 0, columnB.length);
                    int count = 0;
                    for (int j=0; j<columnB.length; j++) {
                        if (cc[i][j]) {
                            count++;
                            cc[i][j] = false;
                            columnBc[j]--;
                        }
                    }
                    result += countAll(cc, rowB, columnBc, remain - count, i+1);
                }
            } else {
                int j = i - rowB.length;
                if (columnB[j] == remain) {
                    result++;
                    continue;
                }
                if (columnB[j] < remain) {
                    result += countAll(c, rowB, columnB, remain - columnB[j], i+1);
                }
            }
        }
        return result;
    }
}