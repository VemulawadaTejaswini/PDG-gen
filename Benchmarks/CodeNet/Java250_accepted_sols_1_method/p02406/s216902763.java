import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String cout = "";
        int x;
        outside: for (int i = 1; i <= n; i++) {
            x = i;
            if (x % 3 == 0) {
                cout += " " + i;
                continue;
            } else {
                do {
                    if (x % 10 == 3) {
                        cout += " " + i;
                        continue outside;
                    }
                    x /= 10;
                } while (x > 0);
            }
        }
        System.out.println(cout);
    }
}