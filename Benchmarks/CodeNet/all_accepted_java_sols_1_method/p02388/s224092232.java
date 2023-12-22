import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r =
            new BufferedReader(new InputStreamReader(System.in), 1);
        int x = Integer.parseInt(r.readLine());
        x = x*x*x;
        System.out.println(x);
    }
}