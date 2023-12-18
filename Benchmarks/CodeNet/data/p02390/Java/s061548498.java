import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());

        int h = s / 3600;

        int m = (s - h * 3600) / 60;

        s = s - (h * 3600) - (m * 60);

        System.out.println(h + ":" + m + ":" + s);
    }
}
