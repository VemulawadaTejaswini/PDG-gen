import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String C[] = new String[2 * H];
        for (int i = 0; i < 2 * H; i += 2) {
            C[i] = sc.next();
            C[i + 1] = C[i];
        }
        for (int i = 0; i < 2 * H; i++) {
            System.out.println(C[i]);
        }
    }
}