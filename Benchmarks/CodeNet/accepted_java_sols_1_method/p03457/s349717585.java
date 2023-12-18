import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nt = 0;
        int nx = 0;
        int ny = 0;

        boolean isOk = true;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            long distance = (Math.abs(nx - x) + Math.abs(ny - y));
            if (((t - nt) < distance || ((t - nt) - distance) % 2 != 0)) {
                isOk = false;
                break;
            }
        }
        System.out.println(isOk?"Yes":"No");
    }
}
