import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String r = br.readLine();
            int in = Integer.parseInt(r);
            int h = Math.floorDiv(in, 3600);
            int m = Math.floorDiv(Math.floorMod(in, 3600), 60);
            int s = Math.floorMod(Math.floorMod(in, 3600), 60);
            System.out.println(h + ":" + m + ":" + s);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}