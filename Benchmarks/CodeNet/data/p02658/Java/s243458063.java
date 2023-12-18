import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        int N = Integer.parseInt(line);
        String[] lines = bufferedReader.readLine().split(" ");
        List<String> Astr = Arrays.asList(lines);
        List<BigInteger> A = Astr.stream().map(BigInteger::new).collect(Collectors.toList());
        BigInteger res = new BigInteger("1");
        BigInteger lim = new BigInteger("1000000000000000000");
        for (BigInteger a : A) {
            res = res.multiply(a);
            if (res.compareTo(BigInteger.ZERO) == 0) {
                System.out.println("0");
                return;
            }
            if (res.compareTo(lim) > 0) {
                System.out.println("-1");
                return;
            }
        }
        System.out.println(res.compareTo(lim) > 0 ? "-1" : res.toString());
    }
}
