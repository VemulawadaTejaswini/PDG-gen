import java.io.*;

public class Main {

    final static int MENU_PRICE = 800;
    final static int PAID_PRICE = 200;
    final static int PAID_PER_COUNT = 15;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        int x = n * MENU_PRICE;
        int y = n / PAID_PER_COUNT * PAID_PRICE;
        System.out.println(x - y);
    }
}