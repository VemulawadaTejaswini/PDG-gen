import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = br.readLine();
        String[] firstLineArray = firstLine.split(" ");
        int K = Integer.parseInt(firstLineArray[1]);

        String secondLine = br.readLine();
        String[] secondLineArray = secondLine.split(" ");

        int result = 0;
        for (String hStr : secondLineArray) {
            int h = Integer.parseInt(hStr);
            if (h >= K) {
                result++;
            }
        }
        System.out.println(result);
    }
}