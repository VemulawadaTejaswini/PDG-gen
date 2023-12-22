import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int next = 1;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            if (a == next) {
                next++;
            } else {
                res++;
            }
        }
        if (next != 1) {
            System.out.println(res);
        } else {
            System.out.println(-1);
        }

    }
}
