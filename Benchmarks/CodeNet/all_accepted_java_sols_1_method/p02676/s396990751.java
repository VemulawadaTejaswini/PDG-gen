import java.io.*;

public class Main {
    public static void main(String [] args) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int k = Integer.parseInt(in.readLine());
            String s = in.readLine();
            if (s.length() <= k) {
                System.out.print(s);
            } else {
                System.out.print(s.substring(0, k) + "...");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}