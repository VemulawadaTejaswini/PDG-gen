import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String str = scan.next();
            if(str.equals("-"))break;
            int n = str.length();
            String[] c = new String[n];

            for (int i = 0; i < n - 1; i++) {
                c[i] = str.substring(i, i + 1);
            }
            c[n - 1] = str.substring(n - 1);
            int hnum = scan.nextInt();
            int h;
            for (int i = 0; i < hnum; i++) {
                h = scan.nextInt();
                String[] A = new String[h];
                for (int j = 0; j < h; j++) {
                    A[j] = c[j];
                }
                for (int j = 0; j < n - h; j++) {
                    c[j] = c[j + h];
                }
                int num = 0;
                for (int j = n - h; j < n; j++) {
                    c[j] = A[num];
                    num++;
                }
            }
            for (int i = 0; i <n; i++) {
                System.out.printf("%s", c[i]);
            }
            System.out.printf("\n");
        }
    }
}
