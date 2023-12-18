import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final String YES = "Yes";
    private static final String NO  = "No";
    private static String REGIX = " ";


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numArray = br.readLine().split(REGIX);

        int a = Integer.parseInt(numArray[0]);
        int b = Integer.parseInt(numArray[1]);
        int c = Integer.parseInt(numArray[2]);

        System.out.println((isSmallNumber(a, b) && isSmallNumber(b, c)) ? YES : NO);

    }

    private static boolean isSmallNumber(int a, int b) {
        return a < b;
    }
}