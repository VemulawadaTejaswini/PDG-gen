import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = buf.readLine();
        int x = Integer.parseInt(s);
        int res = x * x * x;
        System.out.println(res);
    }
}