import java.io.*;

class Main {
    static BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int x = ReadInt();
        int res = x * x * x;
        System.out.println(res);
    }
    static int ReadInt() throws IOException {
        String s = buf.readLine();
        return Integer.parseInt(s);
    }
}