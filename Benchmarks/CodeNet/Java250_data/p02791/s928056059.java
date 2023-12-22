import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] min_p = new int[n];
        int counter = 0;
        for (int i = 0; i < p.length; i++) {
            p[i] = sc.nextInt();
        }
        min_p[0] = p[0];
        for (int i = 0; i < n; i++) {
            if (i >= 1) {
                if (min_p[i - 1] > p[i]) {
                    min_p[i] = p[i];
                } else {
                    min_p[i] = min_p[i - 1];
                }
            }
            if (p[i] == min_p[i]) {
                counter++;
            }
        }
        System.out.println(counter);
        sc.close();
    }
}