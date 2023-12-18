import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String[] lo = reader.readLine().split(" ");
        long a = Long.parseLong(lo[0]);
        double b = Double.parseDouble(lo[1]);
        long res = (long)(a*b);
        System.out.println(res);
    }
}
