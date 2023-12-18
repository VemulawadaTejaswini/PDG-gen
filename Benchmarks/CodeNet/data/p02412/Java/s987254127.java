import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int k;
        int count = 0;
        while (true) {
            int a = sc.nextInt();
            int n = sc.nextInt();
            if (a == 0 && n == 0) {
                break;
            } else {
                for (i = 1; i < n + 1; i++) {
                    for (j = i; j < n + 1; j++) {
                        for (k = j; k < n + 1; k++) {
                            if (i + j + k == a) {
                                count = count + 1;
                            }
                        }
                    }
                }System.out.println(count);
            }
        }
    }
}
