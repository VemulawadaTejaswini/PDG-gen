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
        int c = Integer.parseInt(input[2]);

        String result = "No";
        if (a < b && b < c) {
            result = "Yes";
        }

        System.out.println(result);
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