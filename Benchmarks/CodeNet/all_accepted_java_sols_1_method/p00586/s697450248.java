
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            String[] strArray = str.split(" ");
            int[] numArray = new int[strArray.length];
            for (int count = 0; count < strArray.length; count++) {
                numArray[count] = Integer.parseInt(strArray[count]);
            }
            int output = numArray[0] + numArray[1];
            System.out.println(output);
        }
    }
}