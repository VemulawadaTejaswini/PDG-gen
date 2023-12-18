import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.next();
            if (str.equals("-")) {
                break;
            }
            int m = sc.nextInt();
            int[] h = new int[m];
            for (int i = 0; i < m; i++) {
                h[i] = sc.nextInt();
            }
            for (int j = 0; j < m; j++) {
                str = str.substring(h[j]) + str.substring(0, h[j]);
            }
            System.out.println(str);
        }
        sc.close();
    }
}
