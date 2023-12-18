import java.io.*;

class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.next();
        int n = Integer.parseInt(line);
        System.out.println(n * n * n);
    }
}