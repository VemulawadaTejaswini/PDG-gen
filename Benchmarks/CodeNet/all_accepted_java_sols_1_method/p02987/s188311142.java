import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a[] = new int[1000];
        Arrays.fill(a, 0);
        for (int i = 0; i < 4; i++) {
            a[s.charAt(i)]++;
        }
        int cnt = 0;
        for (int i = 0; i < 1000; i++) {

            if (a[i] == 2) {
                cnt++;
            }
        }
        if (cnt == 2) {
            System.out.println(("Yes"));
        } else {
            System.out.println(("No"));
        }
        sc.close();
    }
}
