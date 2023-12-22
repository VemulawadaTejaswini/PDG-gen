import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) throws Exception{
        int number;
        double comp;
        boolean isPrime;
        LinkedHashSet<Integer> prime;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        while(line!=null) {
            number = Integer.parseInt(line);
            prime = new LinkedHashSet<>();
            if(number >= 2){
                prime.add(2);
            }
            for (int i = 3; i < number + 1; i += 2) {
                isPrime = true;
                for (int p : prime) {
                    comp = (double) i / (double) p;
                    if (p == 1) {
                        continue;
                    }
                    if (i % p == 0) { //iが見つかった素数で割り切れる
                        isPrime = false;
                        break;
                    } else if (p > comp) {
                        break;
                    }
                }
                if (isPrime) {
                    prime.add(i);
                }
            }
            System.out.println(prime.size());
            line = br.readLine();
        }
    }
}