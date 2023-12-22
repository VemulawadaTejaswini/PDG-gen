import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] a = new long[n][3];
        for(int i=0; i<n; i++){
            a[i][0] = sc.nextLong();
            a[i][1] = sc.nextLong();
            a[i][2] = (a[i][0] + a[i][1]);
        }

        Arrays.sort(a, (aa, ab) -> Long.compare(aa[2], ab[2]));

        long ma = 0;
        long mb = 0;
        int posl = 0;
        int posr = n-1;

        for(int i=0; i<n; i++){
            if(i % 2 == 0){
                ma += a[n-i-1][0];
            }else{
                mb += a[n-i-1][1];
            }
        }

        System.out.println(ma - mb);

    }
}