import java.io.*;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int A = 0;
            int B = 0;
            try {
                String str = br.readLine();
                int x = Integer.parseInt(str);
                if (x == 0) {
                    break;
                }
                for (int i = 0; i < x; i++) {
                    String st = br.readLine();
                    String[] s = st.split(" ", 0);
                    int a = Integer.parseInt(s[0]);
                    int b = Integer.parseInt(s[1]);
                    if (a > b) {
                        A += a + b;
                    } else if (a < b) {
                        B += a + b;
                    } else {
                        A += a;
                        B += b;
                    }
                }
                System.out.println(A + " " + B);
            } catch (IOException ex) {
            }
        }
    }
}