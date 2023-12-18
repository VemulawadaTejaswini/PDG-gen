import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = br.readLine();
            while(line!=null) {

                int x = Integer.parseInt(line);
                int a = 0, b = 0, c = 0, d = 0, i = 0, count = 0;
                while (i < 10000) {
                    if (a == 10) {
                        a = 0;
                        b++;
                    }
                    if (b == 10) {
                        b = 0;
                        c++;
                    }
                    if (c == 10) {
                        c = 0;
                        d++;
                    }
                    if (a + b + c + d == x) {
                        count++;
                    }
                    a++;
                    i++;
                }
                System.out.println(count);
                line = br.readLine();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}