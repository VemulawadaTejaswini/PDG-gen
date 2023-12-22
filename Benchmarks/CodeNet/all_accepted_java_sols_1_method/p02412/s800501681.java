import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int[] a = new int[]{sc.nextInt(), sc.nextInt()};
            if (a[0] == 0 && a[1] == 0) {
                break;
            }
            long count = 0;
            for (int i = 1; i < a[0]; i++) {
                for (int j = i + 1; j < a[0]; j++) {
                    for (int k = j + 1; k <= a[0]; k++) {
                        if (i + j + k == a[1]) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}