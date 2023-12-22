import java.io.*;
  
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line;
        LOOP: while ((line = input.readLine()) != null) {
            int line_len = line.length();
            if (line_len == 1 && line.charAt(0) == '0')
                break LOOP;
            long total = 0;
            for (int i = 0; i < line_len; i++) {
                total += line.charAt(i) - '0';
            }
            System.out.println(total);
        }
    }
}