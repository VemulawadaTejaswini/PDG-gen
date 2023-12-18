import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            String S = sc.next();

            char[] C = S.toCharArray();
            for (int i = 0; i < C.length; i++) {
                int c = (int) (C[i]) + N;
                if (c > 90) {
                    c -= 26;
                }
                C[i] = (char) c;
            }

            System.out.println(String.valueOf(C));
        }
    }

}
