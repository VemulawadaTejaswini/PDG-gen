import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        int s;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            s = Integer.parseInt(br.readLine());
        }
        int h = s / 3600;
        s -= h * 3600;

        int m = s / 60;
        s -= m * 60;

        System.out.printf("%d:%d:%d%n", h, m, s);
    }

}

