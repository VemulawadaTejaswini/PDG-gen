import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] line = reader.readLine().split(" ");

            int W = Integer.parseInt(line[0]);
            int H = Integer.parseInt(line[1]);
            int x = Integer.parseInt(line[2]);
            int y = Integer.parseInt(line[3]);
            int r = Integer.parseInt(line[4]);

            if((x-r >= 0) && (x+r <= W) && (y-r >= 0) && (y+r <= H)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}