import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt();
        int answer = -1, mod = 0;
        for (int i = 1; i <= (int) 1e6; i++) {
            mod = mod * 10 + 7;
            mod %= n;
            if (mod == 0) {
                answer = i; break;
            }
        }
        System.out.println(answer);
    }
}