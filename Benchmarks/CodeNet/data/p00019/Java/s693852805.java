import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        try {
            String line;
            int n = Integer.parseInt(br.readLine());
            System.out.println(factrial(n));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static long factrial(int n) {
        long m;
        if (n == 0) {
            return 1;
        }
        m = factrial(n - 1);
        return n * m;
    }

}