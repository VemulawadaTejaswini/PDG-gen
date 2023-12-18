import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int[] a = new int[3];

        while (true) {
            int n = scan.nextInt(), x = scan.nextInt();
            if (n == 0 && x == 0) break;
            int count = 0;

            for (int i = 1; i < n + 1; i++) {
                for (int j = i + 1; j < n + 1; j++) {
                    for (int k = j + 1; k < n + 1; k++) {
                        if ((i + j + k) == x) {
                            if (!(i == k || j == i || k == j)) {
                                count++;
                            }

                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}