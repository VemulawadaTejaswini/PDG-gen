import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        String line = readLine(System.in);
        String[] input = line.split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        String operator = null;
        if (a < b) {
            operator = "<";
        } else if (a > b) {
            operator = ">";
        } else {
            operator = "==";
        }

        System.out.println("a " + operator + " b");
    }

    private static String readLine(InputStream in) {
        String line = null;
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new InputStreamReader(in));
            line = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return line;
    }
}