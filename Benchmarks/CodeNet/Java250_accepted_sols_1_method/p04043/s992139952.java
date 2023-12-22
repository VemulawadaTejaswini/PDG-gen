import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        int f = 2;
        int s = 1;
        String str = null;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            str = br.readLine();

            String[] i = str.split(" ");


            for (int j = 0; j < 3; j++) {
                if (i[j].equals("5")) {
                    --f;
                } else if (i[j].equals("7")) {
                    --s;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("NO");
        } catch (IOException e) {
            System.out.println("NO");
        }
        if (f == 0 && s == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}