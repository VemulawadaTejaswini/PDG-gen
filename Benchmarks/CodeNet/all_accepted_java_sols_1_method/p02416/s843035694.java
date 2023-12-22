import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
            while (true) {
                String s = in.readLine();
                if (s.equals("0")) break;

                int sum = 0;
                for (int i = 0; i < s.length(); i++) {
                    int n = Character.digit(s.charAt(i), 10);
                    sum += n;
                }
                System.out.println(sum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

