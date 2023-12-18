import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc;// = new Scanner(System.in);
        sc = new Scanner(System.in);
        int count = 0;
        while(true) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if (n == 0 && x == 0) break;
            for (int a = 1; a <= n; a++) {
                for (int b = a + 1; b <= n; b++) {
                    for (int c = b + 1; c <= n; c++) {
                        if (a + b + c == x) {
                            count++;
                            break;
                        }
                    }
                }
            }
            System.out.println(count);
            count = 0;
            sc.nextLine();
        }
    }
}
