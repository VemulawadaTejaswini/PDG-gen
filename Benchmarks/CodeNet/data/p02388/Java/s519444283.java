import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            int lim = Integer.parseInt(in.readLine());

            for (int i = 0; i < lim; i++) {
                String[] values = in.readLine().split(" ");
                int a = Integer.parseInt(values[0]);
                System.out.println(a*a*a);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}