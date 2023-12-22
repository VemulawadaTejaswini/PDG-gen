import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 枚数
        int N = sc.nextInt();
        // 合計金額
        int Y = sc.nextInt();
        // x=10000円札の枚数
        int z = 0;
        // y=5000円札の枚数
        int y = 0;

        int AnsZ = -1;
        int AnsY = -1;
        int AnsX = -1;
        for (z = 0; z <= N; z++) {
            for (y = 0; (y +z)<= N; y++) {
                int x=N-z-y;
                int tempY = 10000 * z + 5000 * y+1000*x;
                if (tempY == Y) {
                    // flag立てる
                    
                    AnsZ = z;
                    AnsY = y;
                    AnsX = x;
                    System.out.println(AnsZ+" "+ AnsY+" "+ AnsX);
                    return;
                }
            }
        }
        System.out.println(AnsZ+" "+ AnsY+" "+ AnsX);
    }
}