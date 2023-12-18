import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = 
                new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int num = Integer.parseInt(line);
        int sec = num % 60;
        int min = num / 60 % 60;
        int hour = num / (60 * 60) % 60;

        System.out.println(String.format("%d:%d:%d", hour, min, sec));
    }
}