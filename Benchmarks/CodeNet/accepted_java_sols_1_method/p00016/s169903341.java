import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        try {
            String line;
            double degree= 90;
            double x = 0;
            double y = 0;

            while (true) {
                line = br.readLine();
                st = new StringTokenizer(line,",");
                double d = Double.parseDouble(st.nextToken());
                double t = Double.parseDouble(st.nextToken());
                if(d == 0 && t == 0){
                    break;
                }
                x += d * Math.cos(degree / 180 * Math.PI);
                y += d * Math.sin(degree / 180 * Math.PI);
                degree -= t;
            }

            System.out.println((int)x);
            System.out.println((int)y);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}