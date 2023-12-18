import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            int x = A + B;
            int y = A - B;
            int z = A * B;

            int ans;
            if (x >= y && x >= z) {
                ans = x;
            } else if (y >= x && y >= z) {
                ans = y;
            } else {
                ans = z;
            }

            System.out.println(ans);
        }
    }

}
