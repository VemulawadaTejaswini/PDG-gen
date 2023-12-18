import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        int debt = 100000;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int w = 0; w < Integer.valueOf(br.readLine()); w++) {
            debt *= 1.05;
            if (debt % 1000 != 0) {
                debt = ((debt / 1000) + 1) * 1000;
            }
        }

        System.out.println(debt);
    }
}