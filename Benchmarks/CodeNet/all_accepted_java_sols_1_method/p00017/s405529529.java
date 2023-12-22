import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        try {
            String line = br.readLine();
            while (line != null) {
                char c;
                int offset = 0;
                while (offset < 26) {
                    for (int i = 0; i < line.length(); i++) {
                        c = line.charAt(i);
                        if (97 <= (int) c && (int) c <= 122) {
                            c = (char) (((int) c - 97 + offset) % 26 + 97);
                        }
                        sb.append(c);
                    }
                    if (sb.toString().contains("that")
                            || sb.toString().contains("the")
                            || sb.toString().contains("this")) {
                        System.out.println(sb.toString());
                        sb.delete(0, sb.toString().length());
                        line = br.readLine();
                        break;
                    }
                    sb.delete(0, sb.toString().length());
                    offset++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}