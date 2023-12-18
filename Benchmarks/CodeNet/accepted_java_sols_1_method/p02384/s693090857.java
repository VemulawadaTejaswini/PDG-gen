import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n, a, b, ai = 0, bi = 0, aj, bj, ansi = 0, ansj = 0;
        int[] label;
        Scanner sc = new Scanner(System.in);
        label = new int[6];
        for (int i = 0; i < 6; i++)
            label[i] = sc.nextInt();
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            for (int j = 0; j < 6; j++) {
                if (a == label[j]) {
                    ai = j;
                    break;
                }
            }
            for (int j = 0; j < 6; j++) {
                if (b == label[j]) {
                    bi = j;
                    break;
                }
            }

            if (ai > 2) {
                aj = 5 - ai;
            } else {
                aj = ai;
            }
            if (bi > 2) {
                bj = 5 - bi;
            } else {
                bj = bi;
            }
            ansj = 3 - aj - bj;
            switch (ansj) {
            case 0:
                if (aj == 1 && bj == 2) {
                    ansi = ansj;
                } else {
                    ansi = 5 - ansj;
                }
                break;
            case 1:
                if (aj == 2 && bj == 0) {
                    ansi = ansj;
                } else {
                    ansi = 5 - ansj;
                }
                break;
            case 2:
                if (aj == 0 && bj == 1) {
                    ansi = ansj;
                } else {
                    ansi = 5 - ansj;
                }
                break;
            }
            if ((ai > 2 && bi <= 2) || (ai <= 2 && bi > 2)) 
                    ansi = 5 - ansi;
            System.out.println(label[ansi]);
        }
    }
}
