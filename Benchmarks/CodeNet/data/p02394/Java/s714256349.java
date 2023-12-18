import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        String line = readLine(System.in);
        String[] input = line.split(" ");
        int w = Integer.parseInt(input[0]);
        int h = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);
        int y = Integer.parseInt(input[3]);
        int r = Integer.parseInt(input[4]);

        boolean flag = true;
        if (x - r < 0) {
            flag = false;
        }
        if (y - r < 0) {
            flag = false;
        }
        if (x + r > w) {
            flag = false;
        }
        if (y + r > h) {
            flag = false;
        }

        String result = flag ? "Yes" : "No";
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