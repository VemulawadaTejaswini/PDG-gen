import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        long n = readLong(System.in);
        System.out.println(n * n * n);
    }

    private static long readLong(InputStream in) {
        long n = 0;
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new InputStreamReader(in));
            String line = reader.readLine();
            n = Long.parseLong(line);
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
        return n;

    }
}