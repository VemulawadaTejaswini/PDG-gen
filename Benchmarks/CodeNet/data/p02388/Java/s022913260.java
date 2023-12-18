import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int x;

        s = buf.readLine();
        x = Integer.parseInt(s);

        System.out.println(x^3);
    }
}