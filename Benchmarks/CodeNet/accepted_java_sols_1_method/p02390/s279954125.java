import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static final int SECONDS_PER_MINUT = 60;
    static final int MINUTES_PER_HOUR = 60;

    public static void main(String[] args) {
        try {
            BufferedReader stdReader = 
                    new BufferedReader( new InputStreamReader(System.in));
            String sStr = stdReader.readLine();

            Integer input = Integer.valueOf(sStr);

            Integer s = input % SECONDS_PER_MINUT;
            int m = ((input - s ) / SECONDS_PER_MINUT ) % MINUTES_PER_HOUR;
            int h = (input - m*SECONDS_PER_MINUT - s) / (SECONDS_PER_MINUT*MINUTES_PER_HOUR);
            System.out.println(h + ":" + m + ":" + s);
            System.exit(0);

            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        } 
    }
}