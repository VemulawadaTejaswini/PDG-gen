import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int a = x;
        int result = -1;
        for (int i = 1; true; i++) {
            if (a % 360 == 0) {
                result = i;
                break;
            }
            a += x;
        }
        System.out.println(result);
        reader.close();
    }
}
