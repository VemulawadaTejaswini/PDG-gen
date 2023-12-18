import java.io.*;
import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            String l;

            // 入力行数を読み飛ばす
            l = reader.readLine(); 
            Pattern a = Pattern.compile(">'(=+)#\\1~");
            Pattern b = Pattern.compile(">\\^(Q=)+~~");
            while ((l = reader.readLine()) != null) {
                Matcher ma = a.matcher(l);
                Matcher mb = b.matcher(l);
                if (ma.matches()) {
                    System.out.println("A");
                } else if (mb.matches()) {
                    System.out.println("B");
                } else {
                    System.out.println("NA");
                }
            }
        } catch (IOException e) {}
    }
}