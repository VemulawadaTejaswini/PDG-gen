import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[][] a = new long[4][3];
        a[0][0] = sc.nextLong();
        a[1][0] = sc.nextLong();
        a[2][0] = sc.nextLong();
        a[3][0] = sc.nextLong();
        a[0][1] = a[0][0] *8;
        a[1][1] = a[1][0] *4;
        a[2][1] = a[2][0] *2;
        a[3][1] = a[3][0];
        a[0][2] = 4;
        a[1][2] = 2;
        a[2][2] = 1;
        a[3][2] = 0;
        Arrays.sort(a, (x, y) -> Long.compare(x[1], y[1]));
        long n = sc.nextLong();
        long ans = 0;
        if(a[0][2] == 0){
            ans += Math.floorDiv(n, 2l) * a[0][0];
            if(n % 2 != 0){
                ans += a[1][0] * a[1][2];
            }
        }else{
            ans = n * a[0][0] * a[0][2];
        }
        System.out.println(ans);
        sc.close();
    }

}
