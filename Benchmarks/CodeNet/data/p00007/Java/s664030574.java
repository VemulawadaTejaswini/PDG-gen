import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            int week = Integer.valueOf(in.readLine());
            int debt = 100000;

            for (int i = 0; i < week; i++) {

                debt = (int) (debt * 1.05);

                if (debt % 1000 > 0) {
                    debt = (debt / 1000 + 1) * 1000;
                }
            }

            System.out.println(debt);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}