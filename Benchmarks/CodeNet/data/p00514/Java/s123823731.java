import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

class Main {
    // returns x! / (y! * z!)
    static String permutation(int x, int y, int z) {
        // make y bigger than z
        if (z > y) {
            int tmp = y;
            y = z;
            z = tmp;
        }

        BigDecimal result = BigDecimal.ONE;

        int counter = 1;

        for (int i = y + 1; i <= x; i++) {
            result = result.multiply(new BigDecimal(String.valueOf(i)));
            if (counter <= z) {
                result = result.divide(new BigDecimal(String.valueOf(counter)));
                counter++;
            }
        }

        for (int i = counter; i <= z; i++) {
            result = result.divide(new BigDecimal(String.valueOf(counter)));
        }

        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int r = Integer.parseInt(input[2]);

        /* 一応ACだが、遅い.
        int nm = n*m;
        
        if(r < nm){
            System.out.println("0");
            return;
        }
        
        int beads = r - nm;
        System.out.println(permutation(beads+n-1, beads, n-1));
        */

        // 以下、他の方のコードを参考にして実装.圧倒的に速い
        r -= n * m;
        if (r < 0) {
            System.out.println("0");
            return;
        }

        BigDecimal result = BigDecimal.ONE;

        for (int i = 0; i < Math.min(r, n - 1); i++) {
            result = result.multiply(new BigDecimal(r + n - 1 - i)).divide(new BigDecimal(i + 1));
        }

        System.out.println(result.toString());
    }
}
