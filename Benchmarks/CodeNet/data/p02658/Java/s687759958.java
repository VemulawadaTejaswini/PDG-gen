import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt();
        boolean flag = false;
        long result = 1;
        for (int i = 0; i < n; i++) {
            result = result * in.nextLong();
            if (result < 0 || result > (long) 1e18) {
                flag = true;
            }
        }
        if (flag)
            System.out.println(result == 0 ? 0 : -1);
        else
            System.out.println(result);
    }
}
