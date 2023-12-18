import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        for(int yen10000 = 0; yen10000 <= n; yen10000++) {
            for(int yen5000 = 0; yen5000 <= n - yen10000; yen5000++) {
                int diff = y - (yen10000 * 10000) - (yen5000 * 5000);
                if(diff == (n - yen10000 - yen5000) * 1000) {
                    System.out.println(yen10000 + " " + yen5000 + " " + diff / 1000);
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}
