import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int F = sc.nextInt();
        sc.close();

        double maxConc = -1;
        int wtr = 0;
        int sgr = 0;
        for (int i = 0; i * A * 100 <= F; ++i) {
            int wA = i * A * 100;
            if (wA > F) {
                break;
            }
            for (int j = 0; j * B * 100 <= F; ++j) {
                int wB = j * B * 100;
                if (wA + wB > F || wA + wB == 0) {
                    break;
                }
                for (int k = 0; wA + wB + (C * k) <= F; ++k) {
                    int sC = C * k;
                    if (sC * 100 > E * (wA + wB)) {
                        break;
                    }
                    for (int l = 0; wA + wB + sC + (D * l) <= F; ++l) {
                        int sD = D * l;
                        if ((sC + sD) * 100 > E * (wA + wB)) {
                            break;
                        }
                        double conc = 1000000 * (sC + sD) / (wA + wB + sC + sD);
                        if (maxConc < conc) {
                            maxConc = conc;
                            wtr = wA + wB;
                            sgr = sC + sD;
                        }
                    }
                }
            }
        }
        System.out.println(wtr + sgr + " " + sgr);
    }
}