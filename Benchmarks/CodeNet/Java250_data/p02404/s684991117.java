import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        System.out.println(process(readAll(System.in)));
    }

    protected static String process(String data) {
        final String[] lines = splitForLines(data);

        StringBuilder sb = new StringBuilder();

        for (String line : lines) {
            final int[] split = split(line);

            int height = split[0];
            int width = split[1];

            if (height == 0 && width == 0) {
                break;
            }

            if (sb.length() > 0) {
                sb.append("\n");
            }

            sb.append(rectangle(width, height));
        }

        return sb.toString();
    }

    static String rectangle(int width, int height) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

                if (i != 0 && i != (height - 1) && j != 0 && j != (width - 1)) {
                    sb.append('.');
                    continue;
                }

                sb.append('#');
            }
            sb.append('\n');
        }

        return sb.toString();
    }

    private static String readAll(InputStream is) {
        InputStreamReader r = null;
        BufferedReader br = null;

        try {
            r = new InputStreamReader(is);
            br = new BufferedReader(r);
            StringBuilder sb = new StringBuilder();
            String s;

            while ((s = br.readLine()) != null) {
                sb.append(s).append('\n');
            }

            return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
            if (r != null) {
                try {
                    r.close();
                } catch (IOException e) {
                }
            }
        }
    }

    private static int[] split(String s) {
        final String[] s0 = s.split(" ");
        int[] ia = new int[s0.length];

        for (int i = 0; i < s0.length; i++) {
            ia[i] = Integer.parseInt(s0[i]);
        }

        return ia;
    }

    private static String[] splitForLines(String lines) {
        return lines.split("\\n");
    }

}