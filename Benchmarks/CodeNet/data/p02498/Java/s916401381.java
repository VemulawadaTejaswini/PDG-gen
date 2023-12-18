import java.io.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in =
            new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        char[] chars = s.toCharArray();
        for (char c: chars) {
            if (Character.isLowerCase(c)) {
                System.out.print(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                System.out.print(Character.toLowerCase(c));
            } else {
                System.out.print(c);
            }
        }
        System.out.println();
    }
}