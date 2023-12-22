import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new
InputStreamReader(System.in));
        String[] lineArray = br.readLine().split(" ", 0);
        long d = Long.parseLong(lineArray[0]);
        long a = Long.parseLong(lineArray[1]);
        long b = Long.parseLong(lineArray[2]);
        if (b <= a) {
            System.out.println("delicious");
        } else if (b <= a + d) {
            System.out.println("safe");
        } else if (b > a + d) {
            System.out.println("dangerous");
        }
    }
}