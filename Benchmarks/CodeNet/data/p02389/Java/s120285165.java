package test;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String a = reader.readLine();
            String b = reader.readLine();
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            System.out.println(x * y);
            System.out.println(2 * x + 2 * y);
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("エラー");
        }
    }
}
