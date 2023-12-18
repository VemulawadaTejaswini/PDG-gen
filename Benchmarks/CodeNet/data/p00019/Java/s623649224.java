import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            String input = in.readLine();

            long result = calculation(Long.valueOf(input));

            System.out.println(result);

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

    private static long calculation(Long num) {

        if (num == 1) {
            return num;
        } else {
            return num * calculation(num - 1);
        }
    }
}