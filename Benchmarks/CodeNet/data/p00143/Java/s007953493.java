import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            double[] l = new double[10];
            for (int i = 0; i < 10; i++) {
                l[i] = sc.nextDouble();
            }
            int[] count = new int[3];
            for (int i = 0; i < 4; i += 2) {
                for (int j = 0; j < 6; j += 2) {
                    if (ex(l[6 + i], l[7 + i], l[j], l[j + 1], l[(j + 2) % 6], l[(j + 3) % 6]) > 0) {
                        count[i / 2]++;
                    }
                }
                if (count[i / 2] % 3 == 0) {
                    count[2]++;
                }
            }
            System.out.println(count[2] == 1 ? "OK" : "NG");
        }
    }

    static double ex(double... l) {
        return (l[2] - l[0]) * (l[5] - l[1]) - (l[4] - l[0]) * (l[3] - l[1]);
    }
}
