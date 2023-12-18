import java.io.*;

class Main {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(final String[] args) throws IOException {
        final int x = Integer.parseInt(br.readLine());
        System.out.println(x * x * x);
    }
}