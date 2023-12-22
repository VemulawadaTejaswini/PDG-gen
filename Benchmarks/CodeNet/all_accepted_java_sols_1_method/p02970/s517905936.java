import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());

        int res = N / ((2 * D) + 1);
        if (N % ((2 * D) + 1) != 0) {
            res++;
        }

        System.out.println(res);
    }
}

