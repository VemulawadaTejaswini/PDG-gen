import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
            int n = 0;

            String W = in.readLine();

            while (true) {
                String s = in.readLine();
                if (s.equals("END_OF_TEXT")) break;

                String[] arr = s.toLowerCase().split(" ");
                for (int i = 0; i < arr.length; i++) {
                    if (W.equals(arr[i])) n++;
                }
            }
            System.out.println(n);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

