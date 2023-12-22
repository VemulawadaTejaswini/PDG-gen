import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int dataCount = Integer.parseInt(reader.readLine());
        String[] inputDataList = new String[dataCount];
        for (int i = 0; i < dataCount; i++) {
            inputDataList[i] = reader.readLine();
        }
        for (int i = 0; i < dataCount; i++) {
            String[] data = inputDataList[i].split(" ");
            int a = Integer.parseInt(data[0]);
            int b = Integer.parseInt(data[1]);
            int c = Integer.parseInt(data[2]);
            if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                System.out.println("YES");
            } else if (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) {
                System.out.println("YES");
            } else if (Math.pow(c, 2) + Math.pow(a, 2) == Math.pow(b, 2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}