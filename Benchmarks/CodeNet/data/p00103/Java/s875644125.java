import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int score = 0;
        int hit = 0;
        int out = 0;
        while (n > 0) {
            switch (br.readLine()) {
            case "HIT":
                if (hit < 3) {
                    hit++;
                } else {
                    score++;
                }
                break;
            case "OUT":
                out++;
                if (out >= 3) {
                    n--;
                    score = 0;
                    hit = 0;
                    out = 0;
                }
                break;
            case "HOMERUN":
                score += hit + 1;
                System.out.println(score);
                hit = 0;
                break;
            }
        }
    }
}

