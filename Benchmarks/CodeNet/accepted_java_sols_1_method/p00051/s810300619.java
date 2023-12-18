import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        while (count-- > 0) {
            String input = reader.readLine();
            if (input == null) {
                break;
            }
            char[] temp = input.toCharArray();
            Arrays.sort(temp);
            char[] temp2 = new char[temp.length];
            for(int i = temp.length; i > 0; i--) {
                temp2[temp.length - i] = temp[i - 1];
            }
            int min = Integer.parseInt(String.valueOf(temp));
            int max = Integer.parseInt(String.valueOf(temp2));
            System.out.println(max - min);
        }
    }
}