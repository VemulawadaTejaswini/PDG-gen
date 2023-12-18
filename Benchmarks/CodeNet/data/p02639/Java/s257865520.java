import java.util.Scanner;

public class problemA {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        byte ans = 0;
        for (byte i = 0; i < 5; ++i) {
            int x = in.nextInt();
            if (x == 0) {
                ans = (byte) (i + 1);
            }
        }
        System.out.println(ans);
    }
}
