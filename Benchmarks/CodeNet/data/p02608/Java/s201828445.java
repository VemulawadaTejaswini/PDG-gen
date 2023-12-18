import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = (int) (Math.sqrt(n) + 1) / 4;
        for(int i=1; i<=n; i++) {
            int ans = 0;
            for(int x=1; x<=sq; x++) {
                int x1 = (int) Math.pow(x, 2);
                int y1 = (int) Math.pow(1, 2);
                int z1 = (int) Math.pow(1, 2);
                int xy1 = x * 1;
                int yz1 = 1 * 1;
                int zx1 = 1 * x;
                int sum1 = x1 + y1 + z1 + xy1 + yz1 + zx1;
                if(i < sum1)break;
                for(int y=1; y<=sq; y++) {
                    int x2 = (int) Math.pow(x, 2);
                    int y2 = (int) Math.pow(y, 2);
                    int z2 = (int) Math.pow(1, 2);
                    int xy2 = x * y;
                    int yz2 = y * 1;
                    int zx2 = 1 * x;
                    int sum2 = x2 + y2 + z2 + xy2 + yz2 + zx2;
                    if(i < sum2)break;
                    for(int z=1; z<=sq; z++) {
                        int x3 = (int) Math.pow(x, 2);
                        int y3 = (int) Math.pow(y, 2);
                        int z3 = (int) Math.pow(z, 2);
                        int xy3 = x * y;
                        int yz3 = y * z;
                        int zx3 = z * x;
                        int sum3 = x3 + y3 + z3 + xy3 + yz3 + zx3;
                        if(i == sum3) {
                            ans++;
                            break;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}