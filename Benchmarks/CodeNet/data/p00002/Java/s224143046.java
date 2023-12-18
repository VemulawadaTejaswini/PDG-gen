import java.io.*;

public class Main {
    public static void main(String[] a) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        // データ読み込み
        while ((line = in.readLine()) != null) {
            String res = String.valueOf(Integer.parseInt(line.split(" ")[0]) + Integer.parseInt(line.split(" ")[1]));
            System.out.println(res.length());
        }
    }
}