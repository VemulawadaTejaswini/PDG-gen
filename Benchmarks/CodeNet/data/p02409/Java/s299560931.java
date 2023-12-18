import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void result(int data[][], int check) {
        if (check == 4) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.printf(" %d", data[i][j]);
                }
                System.out.print("\n");
            }
        } else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.printf(" %d", data[i][j]);
                }
                if (i == 2) {
                    System.out.print("\n####################\n");
                } else {
                    System.out.print("\n");
                }
            }
        }
    }

    public static void main(String[] args) {
        int first[][] = new int[3][10];
        int second[][] = new int[3][10];
        int third[][] = new int[3][10];
        int forth[][] = new int[3][10];

        int b, f, r, v, rep;
        String data[];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            rep = Integer.parseInt(br.readLine());
            while (rep-- > 0) {
                data = br.readLine().split(" ");
                b = Integer.parseInt(data[0]);
                f = Integer.parseInt(data[1]);// 행
                r = Integer.parseInt(data[2]);// 렬
                v = Integer.parseInt(data[3]);

                if (b == 1) {
                    first[f - 1][r - 1] += v;
                } else if (b == 2) {
                    second[f - 1][r - 1] += v;
                } else if (b == 3) {
                    third[f - 1][r - 1] += v;
                } else if (b == 4) {
                    forth[f - 1][r - 1] += v;
                }
            }
            result(first, 1);
            result(second, 2);
            result(third, 3);
            result(forth, 4);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
