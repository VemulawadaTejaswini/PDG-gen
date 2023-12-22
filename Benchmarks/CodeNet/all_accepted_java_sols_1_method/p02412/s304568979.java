
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int k;
        while (true) {
            int count = 0;
            int n = sc.nextInt();
            int a = sc.nextInt();
            if (a == 0 && n == 0) {
                break;
            } else {
                for (i = 1; i < n + 1; i++) {
                    for (j = i+1; j < n + 1; j++) {
                        for (k = j+1; k < n + 1; k++) {
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
