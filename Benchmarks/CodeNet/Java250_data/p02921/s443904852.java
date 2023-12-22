import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String weather = rd.readLine();
        String input = rd.readLine();

        int result = 0;
        for(int i=0; i<3; i++) {
            if(weather.charAt(i) == input.charAt(i)) {
                result++;
            }
        }
        System.out.print(result);
    }
}