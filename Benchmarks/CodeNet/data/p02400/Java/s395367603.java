import java.io.*;

public class Main {
    static float area(int r) {
        return r * r * (float)Math.PI;
    }

    static float circuit(int r) {
        return r * 2 * (float)Math.PI;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int radius = Integer.parseInt(line);
        System.out.print(area(radius));
        System.out.print(" ");
        System.out.print(circuit(radius));
        System.out.println();
    }
}