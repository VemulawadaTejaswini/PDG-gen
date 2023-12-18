import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PrimeNumberGenerator png = new PrimeNumberGenerator();

        while(true){
            String tmpStr = br.readLine();
            if(tmpStr == null){
                break;
            }

            int n = Integer.parseInt(tmpStr);

            int count = 0;
            for(int i = 2; i <= n; i++){
                if(png.isPrime(i)){
                    count++;
                }
            }

            System.out.println(count);
        }
    }

}

class PrimeNumberGenerator {
	private final int N = 100000000;
    private boolean[] isPrime= new boolean[N + 1];

    public PrimeNumberGenerator() {
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        int limit = (int)Math.sqrt(N);
        for(int i = 2; i <= limit ; i++){

            if(isPrime[i] == false){
                continue;
            }

            for(int j = i * 2; j <= N; j += i){
                isPrime[j] = false;
            }
        }
    }

    public boolean isPrime(int index){
        return isPrime[index];
    }
}