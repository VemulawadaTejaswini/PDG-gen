import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] arr = br.readLine().split("");
        long zeroCount = Arrays.stream(arr).filter(num -> "0".equals(num)).count();
        long oneCount = arr.length - zeroCount;
        out.println(Math.min(zeroCount, oneCount) * 2);
        out.close();
    }
}
