import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        long[] d = {0, 0, 0, 0, 0};
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            if (name.charAt(0) == 'M') {
                d[0]++;
            } else if (name.charAt(0) == 'A') {
                d[1]++;
            } else if (name.charAt(0) == 'R') {
                d[2]++;
            } else if (name.charAt(0) == 'C') {
                d[3]++;
            } else if (name.charAt(0) == 'H') {
                d[4]++;
            }
        }
        sc.close();

        long p = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = i+1; j < 4; j++) {
                for (int k = j+1; k < 5; k++) {
                    if (d[i] * d[j] * d[k] > 0) {
                        p += d[i] * d[j] * d[k];
                    }
                }
            }
        }
        System.out.println(p);
    }
}
