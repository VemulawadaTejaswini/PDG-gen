import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int N = Integer.parseInt(br.readLine());
	    String [] info = br.readLine().split(" ");
        long mVal = (long)Math.pow(10,18);

        BigInteger sum = BigInteger.valueOf(Long.parseLong(info[0]));
        BigInteger max = BigInteger.valueOf((long)Math.pow(10,18));


	    for(int i = 1; i < N; i++){
            sum = sum.multiply(BigInteger.valueOf(Long.parseLong(info[i])));
        }

        if(sum.compareTo(max) > 0){
            System.out.println("-1");
        }
        else {
            System.out.println(sum);
        }
    }
}
