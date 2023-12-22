import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = parseInt(read.readLine());
        int ac =0,wa=0,tle=0,re=0;
        for (int i = 0;i<t;i++){
            String S = read.readLine();
            if (S.contains("AC")){
                ac++;
            }
            else if (S.contains("WA")){
                wa++;
            }
            else if (S.contains("TLE")){
                tle++;
            }
            else if (S.contains("RE")){
                re++;
            }
        }
        System.out.println("AC x "+ac+"\nWA x "+wa+"\nTLE x "+tle+"\nRE x "+re);
    }
}
