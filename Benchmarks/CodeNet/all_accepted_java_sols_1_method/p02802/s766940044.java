import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            boolean[] check = new boolean[N];
            int[] W = new int[N];

            int a = 0;
            int w = 0;

            for (int i = 0; i < M; i++) {
                int p = sc.nextInt() - 1;
                String s = sc.next();

                if (s.equals("AC")) {
                    if (!check[p]) {
                        a++;
                        w += W[p];
                        check[p] = true;
                    }
                } else if (s.equals("WA")) {
                    W[p]++;
                }
            }

            System.out.println(a + " " + w);
        }
    }

}
