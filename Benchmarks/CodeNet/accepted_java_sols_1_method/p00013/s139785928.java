import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    private static final String ZERO = "0";

    public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        Stack<String> cars = new Stack<String>();

        try {
            while ((input = in.readLine()) != null) {

                if (ZERO.equals(input)) {
                    System.out.println(cars.pop());
                } else {
                    cars.push(input);
                }
            }
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