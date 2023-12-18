import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        while (in.hasNext()) {
            int n = in.nextInt();
            int count = 0;
            for (int a = 0; a <= 9; a++) {
                if (a > n) {
                    break;
                } else if (a + 27 < n) {
                    continue;
                }

                for (int b = 0; b <= 9; b++) {
                    int ab = a + b;
                    if (ab > n) {
                        break;
                    } else if (ab + 18 < n) {
                        continue;
                    }

                    for (int c = 0; c <= 9; c++) {
                        int abc = ab + c;
                        if (abc > n) {
                            break;
                        } else if (abc + 9 < n) {
                            continue;
                        } 

                        int d = n - abc;
                        if (d >= 0 && d <= 9) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}