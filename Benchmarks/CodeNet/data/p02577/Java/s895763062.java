import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.stream.IntStream;

public class Main {

    // Multiple of 9
    public static String multipleOfNine(String Number){
        int sumOfDigits = 0;
        String[] digits2 = Number.split("(?<=.)");
        for (int i = 0; i <digits2.length ; i++) {
            sumOfDigits += Integer.parseInt(digits2[i]);
        }
        return sumOfDigits%9 == 0 ? "Yes": "No";
    }

    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(in);
        try {
            String input = bufferedReader.readLine();
            String[] inputsArrays = input.split(" ");
            String N = inputsArrays[0];
            System.out.println(multipleOfNine(N));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}