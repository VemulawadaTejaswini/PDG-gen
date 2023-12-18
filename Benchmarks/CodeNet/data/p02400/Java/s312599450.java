import java.io.*;
public class Circle {
    static float area(int r) {
        return r * r * (float)Math.PI;
    }

    static float circuit(int r) {
        return r * 2 * (float)Math.PI;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int radius = Integer.parseInt(line);
        System.out.print(Circle.area(radius));
        System.out.print(" ");
        System.out.print(Circle.circuit(radius));
        System.out.println();
    }
}