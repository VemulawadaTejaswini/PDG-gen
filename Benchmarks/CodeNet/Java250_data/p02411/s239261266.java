import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][][] bfr = new int[4][3][10];
        StringBuilder sb = new StringBuilder();

        while (in.hasNext()) {
            int m = in.nextInt();
            int f = in.nextInt();
            int r = in.nextInt();

            if (m == -1 && f == -1 && r == -1) {
                break;
            }

            if (m == -1 || f == -1) {
                sb.append("F").append("\n");
            } else {
                if (m + f < 30) {
                    sb.append("F").append("\n");
                } else if (m + f < 50) {
                    sb.append(r >= 50 ? "C" : "D").append("\n");
                } else if (m + f < 65) {
                    sb.append("C").append("\n");
                } else if (m + f < 80) {
                    sb.append("B").append("\n");
                } else {
                    sb.append("A").append("\n");
                }
            }
        }

        System.out.print(sb.toString());
    }
}