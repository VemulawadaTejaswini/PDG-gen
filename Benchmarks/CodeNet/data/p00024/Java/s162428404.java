import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        try {
            int floor;
            double v, maxv, t;
            String line = br.readLine();
            while (line != null) {
                v = 0;
                maxv = Double.parseDouble(line);
                floor = 1;
                for (int i = 1; v <= maxv; i++) {
                    floor = i;
                    v = Math.sqrt((5 * floor - 5) / 4.9) * 9.8;

                }
                System.out.println(floor);
                line = br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}