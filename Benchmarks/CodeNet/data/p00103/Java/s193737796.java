import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        int n, score, hit, out;
        while((line = br.readLine()) != null) {
            n = Integer.parseInt(line);
            for(; n>0; n--) {
                score = 0;
                hit = 0;
                out = 0;
                while(out < 3) {
                    line = br.readLine();
                    if("HIT".equals(line)) {
                        if(hit == 3)
                            score++;
                        else
                            hit++;
                    } else if("HOMERUN".equals(line)) {
                        score++;
                        score += hit;
                        hit = 0;
                    } else if("OUT".equals(line)) {
                        out++;
                    }
                }
                System.out.println(score);
            }
        }
        br.close();
    }
}