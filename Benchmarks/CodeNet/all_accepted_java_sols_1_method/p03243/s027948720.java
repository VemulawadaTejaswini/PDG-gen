import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = n / 111;
        if (n % 111 != 0) {
            i += 1;
        }

        System.out.println(i * 111);
    }
}
