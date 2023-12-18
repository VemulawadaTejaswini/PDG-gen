import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int H = in.nextInt();
        int W = in.nextInt();

        while (H != 0 && W != 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < H; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < W; j++) {
                        if (j % 2 == 0) {
                            sb.append("#");
                        } else {
                            sb.append(".");
                        }
                    }
                } else {
                    for (int j = 0; j < W; j++) {
                        if (j % 2 == 0) {
                            sb.append(".");
                        } else {
                            sb.append("#");
                        }
                    }
                }
                sb.append("\n");
            }
            System.out.println(sb.toString());

            H = in.nextInt();
            W = in.nextInt();
        }

        System.exit(0);
    }
}

