import java.io.*;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        for (int ii = 0; ii < line.length(); ii++) {
            char c = line.charAt(ii);
            if (Character.isUpperCase(c)) {
                System.out.print(Character.toLowerCase(c));
                continue;
            }
            if (Character.isLowerCase(c)) {
                System.out.print(Character.toUpperCase(c));
                continue;
            }
            System.out.print(c);
        }
        System.out.println();
    }
}