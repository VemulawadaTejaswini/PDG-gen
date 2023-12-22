import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] as = br.readLine().split(" ");
        int a1 = Integer.parseInt(as[0]);
        int a2 = Integer.parseInt(as[1]);
        int a3 = Integer.parseInt(as[2]);
        System.out.println(problem147a(a1, a2, a3));
    }

    private static String problem147a(int a1, int a2, int a3) {
        return( (a1 + a2 + a3) >= 22) ? "bust" : "win";
    }
}