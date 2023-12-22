import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt(), B = in.nextInt();
        int res = 0;
        while (A * res - (res - 1) < B) res++;

        System.out.println(res);
    }
}
