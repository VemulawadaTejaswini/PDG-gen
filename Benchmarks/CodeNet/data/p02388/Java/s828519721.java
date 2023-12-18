import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("x=");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x;
        String line = reader.readLine();
        x = Integer.parseInt(line);
        System.out.println(x*x*x);

    }
}
