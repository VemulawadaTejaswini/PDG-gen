import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][][] bfr = new int[4][3][10];
        StringBuilder sb = new StringBuilder();

        int dataCnt = in.nextInt(); // not use
        while (in.hasNext()) {
            int b = in.nextInt() -1;
            int f = in.nextInt() -1;
            int r = in.nextInt() -1;
            int v = in.nextInt();

            bfr[b][f][r] += v;
        }

        printLives(bfr[0], sb);
        sb.append("####################\n");
        printLives(bfr[1], sb);
        sb.append("####################\n");
        printLives(bfr[2], sb);
        sb.append("####################\n");
        printLives(bfr[3], sb);

        System.out.print(sb.toString());
    }

    private static void printLives(int[][] noseCnt, StringBuilder sb) {
        for (int i = 0, iMax = noseCnt.length; i < iMax; i++) {
            for (int j = 0, jMax = noseCnt[i].length ; j < jMax; j++) {
                sb.append(" ").append(noseCnt[i][j]);
            }
            sb.append("\n");
        }
        return;
    }
}