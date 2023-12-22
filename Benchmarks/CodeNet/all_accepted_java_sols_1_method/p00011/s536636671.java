import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int a[] = new int[n];
        int b[] = new int[n];
        int z[] = new int[w];
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            String t[] = s.split(",");
            a[i] = Integer.parseInt(t[0]);
            b[i] = Integer.parseInt(t[1]);
        }
        for (int i = 0; i < w; i++) {
            int p = i + 1;
            for (int j = 0; j < n; j++) {
                if (p == a[j]) {
                    p = b[j];
                } else if (p == b[j]) {
                    p = a[j];
                }
            }
            z[p-1] = i + 1;
        }
        for (int i = 0; i < w; i++) {
            System.out.println(z[i]);
        }
    }
}
