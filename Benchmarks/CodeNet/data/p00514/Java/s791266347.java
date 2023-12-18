import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

class Main{
    // returns x! / (y! * z!)
    static String permutation(int x, int y, int z){
        // make y bigger than z
        if(z > y){
            int tmp = y;
            y = z;
            z = tmp;
        }

        BigDecimal result = BigDecimal.ONE;

        for(int i = y+1; i <= x; i++){
            result = result.multiply(new BigDecimal(String.valueOf(i)));
        }

        for(int i = 2; i <= z; i++){
            result = result.divide(BigDecimal.valueOf(i));
        }

        return result.toString();
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int r = Integer.parseInt(input[2]);

        int nm = n*m;

        if(r < nm){
            System.out.println("0");
            return;
        }

        int beads = r - nm;
        System.out.println(permutation(beads+n-1, beads, n-1));
    }
}
