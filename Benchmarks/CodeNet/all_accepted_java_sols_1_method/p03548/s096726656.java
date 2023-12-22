import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int cnt = 0;
        x -= z;
        while (x >= y + z) {
            x -= (y + z);
            cnt++;
        }
        System.out.println(cnt);
    }
}