import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            int ans = 0;
            for(int x=1; x<=1000; x++) {
                for(int y=1; y<=1000; y++) {
                    for(int z=1; z<=1000; z++) {
                        int xx = (int) Math.pow(x, 2);
                        int yy = (int) Math.pow(y, 2);
                        int zz = (int) Math.pow(z, 2);
                        int xy = x * y;
                        int yz = y * z;
                        int zx = z * x;
                        int sum = xx + yy + zz + xy + yz + zx;
                        if(i == sum) ans++;
                        if(i < sum)break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}