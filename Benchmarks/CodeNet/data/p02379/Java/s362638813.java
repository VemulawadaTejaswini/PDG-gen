import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        double x1 = Integer.parseInt(line[0]);
        double y1 = Integer.parseInt(line[1]);
        double x2 = Integer.parseInt(line[2]);
        double y2 = Integer.parseInt(line[3]);

        System.out.println(Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2)));
    }
}