import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String token;
        int rank;
        boolean[] S = new boolean[13];
        boolean[] H = new boolean[13];
        boolean[] C = new boolean[13];
        boolean[] D = new boolean[13];

        for (int i = 0; i < 13; i++) {
            S[i] = H[i] = C[i] = D[i] = false;
        }

        for (int i = 0; i < n; i++) {
            token = scan.next();
            switch (token) {
                case "S":
                    rank = scan.nextInt();
                    S[rank -1] = true;
                    break;
                case "H":
                    rank = scan.nextInt();
                    H[rank -1] = true;
                    break;
                case "C":
                    rank = scan.nextInt();
                    C[rank -1] = true;
                    break;
                case "D":
                    rank = scan.nextInt();
                    D[rank -1] = true;
                    break;
            }
        }

        for (int i = 0; i < 13; i++) {
            if (!S[i]) System.out.println("S " + (i + 1));
        }
        for (int i = 0; i < 13; i++) {
            if (!H[i]) System.out.println("H " + (i + 1));
        }
        for (int i = 0; i < 13; i++) {
            if (!C[i]) System.out.println("C " + (i + 1));
        }
        for (int i = 0; i < 13; i++) {
            if (!D[i]) System.out.println("D " + (i + 1));
        }
    }
}