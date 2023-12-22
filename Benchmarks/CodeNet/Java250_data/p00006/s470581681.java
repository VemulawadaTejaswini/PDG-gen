import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            char[] str = line.toCharArray();
            char c;
            int i = 0, j = str.length - 1;
            while (i < j) {
                c = str[i];
                str[i] = str[j];
                str[j] = c;
                i++;
                j--;
            }
            System.out.println(str);
        }
    }
}