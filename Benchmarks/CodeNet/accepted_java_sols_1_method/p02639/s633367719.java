import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 1;
        while (sc.hasNext()) {
            int x = sc.nextInt();
            if (x == 0) {
                System.out.println(cnt);
                break;
            }
            cnt++;
        }
        sc.close();
    }
}