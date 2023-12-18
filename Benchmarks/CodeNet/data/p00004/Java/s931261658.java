
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public void main(String[] args) throws IOException {
        String inputStr;
        double resultx, resulty;
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        while ((inputStr = bReader.readLine()) != null) {
            String[] editedStr = inputStr.split(" ");
            int a = Integer.parseInt(editedStr[0]);
            int b = Integer.parseInt(editedStr[1]);
            int c = Integer.parseInt(editedStr[2]);
            int d = Integer.parseInt(editedStr[3]);
            int e = Integer.parseInt(editedStr[4]);
            int f = Integer.parseInt(editedStr[5]);

            int ad = a * d;
            int bd = b * d;
            int cd = c * d;
            int ae = a * e;
            int fa = a * f;

            int c_be = bd - ae;
            int c_cf = cd - fa;

            resulty = c_be / c_cf;
            double iny = b * resulty;
            resultx = a/(c/iny);
            System.out.println(resultx + resulty);
        }
    }
}