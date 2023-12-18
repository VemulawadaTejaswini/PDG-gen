import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        int x = Integer.parseInt(line);
        int answer = (int) Math.pow(x, 3);
        System.out.println(answer);
    }
}