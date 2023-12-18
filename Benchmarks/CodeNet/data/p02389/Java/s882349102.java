import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        int[] side = new int[2];
        BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; side.length; i++) {
            String line = reader.readLine();
            side[i] = Integer.parseInt(line);
        }

        int area = side[0] * side[1];
        int areaLength = ( side[0] + side[1] ) * 2;

        System.out.println(area + " " + areaLength);
    }
}