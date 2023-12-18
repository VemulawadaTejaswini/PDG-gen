import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        int m = 0;
        int l=0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n / i; j++) {
                m = n - (j * i);
                if (m != 0) {
                    l++;
                }
            }
        }
        System.out.println(l);
    }
}
