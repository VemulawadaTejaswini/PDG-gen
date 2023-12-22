import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int[] t = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() };
            int[] r = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() };
            int hit = 0;
            int blow = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (t[i] == r[j]) {
                        if (i == j) {
                            hit++;
                        } else {
                            blow++;
                        }
                    }
                }
            }
            System.out.println(hit + " " + blow);
        }
    }
}
