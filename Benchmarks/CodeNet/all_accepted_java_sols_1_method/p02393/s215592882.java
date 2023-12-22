import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] strArray = br.readLine().split("\\s");
            Integer[] intArray = new Integer[3];
            for (int i = 0; i < strArray.length; i++) {
                intArray[i] = Integer.valueOf(strArray[i]);
            }
            for (int i = 0; i < intArray.length - 1; i++) {
                for (int j = intArray.length - 1; j > i; j--) {
                    if (intArray[j] < intArray[j - 1]) {
                        int t = intArray[j];
                        intArray[j] = intArray[j - 1];
                        intArray[j - 1] = t;
                    }
                }
            }
            System.out.println(intArray[0]+" "+intArray[1]+" "+intArray[2]);
        } catch (IOException e) {
            System.err.println(e);
        }

    }
}