import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s, b;
        String c;
        int count = 0;
        int j = 0;
        try {
            s = br.readLine();
            b = br.readLine();
            c = s + s;
            for (int i = 0; i < c.length() - b.length(); i++) {
                if (b.equals(c.substring(i, i + b.length()))) {
                    System.out.println("Yes");
                    return;
                }
            }
            System.out.println("No");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
