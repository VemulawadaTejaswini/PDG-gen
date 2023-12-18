import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static int MAX_INF = Integer.MAX_VALUE;
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String line;
        while ((line = in.readLine()) != null) {
            st = new StringTokenizer(line, " ");
            int m = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            if (m == 0 && d == 0) {
                break;
            }
            int days = 4;
            switch (m) {
                case 12 : days += 30;
                case 11 : days += 31;
                case 10 : days += 30;
                case 9 : days += 31;
                case 8 : days += 31;
                case 7 : days += 30;
                case 6 : days += 31;
                case 5 : days += 30;
                case 4 : days += 31;
                case 3 : days += 29;
                case 2 : days += 31;
            }
            days += d - 1;
            String ans = "";
            switch (days % 7) {
                case 1 : ans += "Monday"; break;
                case 2 : ans += "Tuesday"; break;
                case 3 : ans += "Wednesday"; break;
                case 4 : ans += "Thursday"; break;
                case 5 : ans += "Friday"; break;
                case 6 : ans += "Saturday"; break;
                case 0 : ans += "Sunday"; break;
            }
            System.out.println(ans);
        }
    }
}
