
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        String str;
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        while ((str = bReader.readLine()) != null) {
            String[] editedStr = str.split(" ");
            Arrays.sort(editedStr);
            System.out.println(FindGCD(Long.parseLong(editedStr[0]), Long.parseLong(editedStr[1])) + " " + FindLCM(Long.parseLong(editedStr[0]), Long.parseLong(editedStr[1])));
        }
    }

    public static long FindGCD(long a, long b){
        long r = a % b;
        while (r > 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    public static long FindLCM(long a, long b) {
        return (a * b) / FindGCD(a, b);
    }
}