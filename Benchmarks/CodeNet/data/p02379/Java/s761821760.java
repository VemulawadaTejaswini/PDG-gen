import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        double x1 = Double.parseDouble(line[0]);
        double y1 = Double.parseDouble(line[1]);
        double x2 = Double.parseDouble(line[2]);
        double y2 = Double.parseDouble(line[3]);
        double dis = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));

        System.out.println(dis);
    }
}