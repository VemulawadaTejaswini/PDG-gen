import java.util.Scanner;

//0305
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int r = sc.nextInt();
            int t = sc.nextInt();
            String a = "";
            for (int y = 0; y < ( t % 30 > 0 ? 2 : 1); y++) {
                for (int x = 0; x < (r % 100 > 0 ? 2 : 1); x++) {
                    if ((x | y) == 1) {
                        a += " ";
                    }
                    a += (t / 30 + y) * 5 + r / 100 + x;
                }
            }
            System.out.println(a);
        }
    }
}
