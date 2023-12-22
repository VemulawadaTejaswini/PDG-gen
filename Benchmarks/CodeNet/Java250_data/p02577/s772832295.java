import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        PrintWriter prnt = new PrintWriter(System.out);
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String s = read.readLine();

        if (isMultipleOFNine(s)) {
            prnt.println("Yes");
        } else {
            prnt.println("No");
        }
        prnt.close();
    }

    static boolean isMultipleOFNine(String s) {
        char[] digits = s.toCharArray();
        long N = 0;
        for (int i = 0; i < digits.length; i++) {
            N += (digits[i] - '0');
        }
        if (N % 9 == 0) return true;
        else return false;
    }
}