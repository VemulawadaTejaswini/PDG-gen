import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int n[] = new int[i];
        for (int j = 0; j < i; j++) {
            n[j] = s.nextInt();
        }
        int c = 0;
        while (true) {
            boolean f = false;
            for (int ni: n) {
                if ((ni % 2) != 0) {
                    f = true;
                }
            }
            if (f) break;
            for (int k = 0; k < i; k++) {
                n[k] = n[k] / 2;
            }
            c++;
        }
        System.out.println(c);
    }
}