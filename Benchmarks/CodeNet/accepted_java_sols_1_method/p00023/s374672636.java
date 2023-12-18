import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        try {
            String line;
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                line = br.readLine();
                st = new StringTokenizer(line);
                double x1 = Double.parseDouble(st.nextToken());
                double y1 = Double.parseDouble(st.nextToken());
                double r1 = Double.parseDouble(st.nextToken());
                double x2 = Double.parseDouble(st.nextToken());
                double y2 = Double.parseDouble(st.nextToken());
                double r2 = Double.parseDouble(st.nextToken());
                double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
                if (distance < r1 - r2) {
                    System.out.println("2");
                } else if (distance < r2 - r1) {
                    System.out.println("-2");
                } else if (distance <= r1 + r2) {
                    System.out.println("1");
                } else{
                    System.out.println("0");
                }

            }
        } catch (
                Exception e
                )

        {
            e.printStackTrace();
        }

    }
}