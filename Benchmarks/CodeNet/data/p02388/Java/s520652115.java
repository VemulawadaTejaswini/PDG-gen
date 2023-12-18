import java.io.*;

class main {
    public static void main(String[] a) throws IOException {
        BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        int x = Integer.parseInt(line);

        int answer = x * x * x;

        System.out.println(answer);
    }
}