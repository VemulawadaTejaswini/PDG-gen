import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        int hour = s / 3600;
        int minute = (s % 3600) / 60;
        int second = s - hour * 3600 - minute * 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}