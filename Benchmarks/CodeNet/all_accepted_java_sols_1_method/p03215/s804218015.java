import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n];
        long[][] b = new long[n][n];
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long max = 0L;
        for (int i = 0; i < n; i++) {
            b[i][i] = a[i];
            if(max < b[i][i]) max = b[i][i];
            list.add(b[i][i]);
            for (int j = i+1; j < n; j++) {
                b[i][j] = b[i][j-1] + a[j];
                if(max < b[i][j]) max = b[i][j];
                list.add(b[i][j]);
            }
        }
        int digit = Long.toBinaryString(max).length();
        long ans = 0L;
        for (int i = digit-1; i >= 0; i--) {
            int tmp = 0;
            List<Long> nex = new ArrayList<>();
            for (int j = 0; j < list.size(); j++) {
                if((list.get(j) >>> i & 1) == 1){
                    tmp++;
                    nex.add(list.get(j));
                }
            }
            if(k <= tmp){
                ans += (1L << i);
                list = nex;
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
