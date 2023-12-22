import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        int[] count = new int['z' - 'a' + 1];

        int c;
        while ((c = System.in.read()) != -1) {
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c))
                    c = Character.toLowerCase(c);
                count[c - 'a']++;
            }
        }

        for (int i = 0; i < count.length; i++)
            System.out.printf("%c : %d\n", 'a' + i, count[i]);
    }
}

