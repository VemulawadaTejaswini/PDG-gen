import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    protected static String process(String data) {
        StringBuilder sb = new StringBuilder();
        final String[] lines = splitForLines(data);

        final int[] split = split(lines[0]);
        final int rows = split[0];
        final int columns = split[1];

        final int[][] matrix = new int[rows][columns];
        final String[] matrixLines = Arrays.copyOfRange(lines, 1, 1 + rows);
        for (int i = 0; i < matrixLines.length; i++) {
            final int[] array = split(matrixLines[i]);

//            for (int j = 0; j < array.length; j++) {
//                matrix[i][j] = array[j];
//            }
            System.arraycopy(array, 0, matrix[i], 0, array.length);
        }

        final int[] vector = new int[columns];
        final String[] vectorLines = Arrays.copyOfRange(lines, 1 + rows, lines.length);
        for (int i = 0; i < vectorLines.length; i++) {
            vector[i] = Integer.parseInt(vectorLines[i]);
        }

        final int[] result = multiply(matrix, vector);

        for (int i : result) {
            sb.append(i).append('\n');
        }

        return sb.toString();
    }

    static int[] multiply(int[][] matrix, int[] vector) {
        int[] result = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[i] += matrix[i][j] * vector[j];
            }
        }

        return result;
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

    private static String[] splitForLines(String lines) {
        return lines.split("\\n");
    }

    private static int[] split(String s) {
        final String[] s0 = s.split(" ");
        int[] ia = new int[s0.length];

        for (int i = 0; i < s0.length; i++) {
            ia[i] = Integer.parseInt(s0[i]);
        }

        return ia;
    }

    public static void main(String[] args) {
        System.out.print(process(readAll(System.in)));
    }
}