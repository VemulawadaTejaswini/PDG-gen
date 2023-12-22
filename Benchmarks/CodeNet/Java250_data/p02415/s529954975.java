import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int c;
        while ((c = System.in.read()) != -1)
            System.out.print(convert((char)c));
    }
    private static char convert(char c) {
        if (Character.isLowerCase(c))
            return Character.toUpperCase(c);
        if (Character.isUpperCase(c))
            return Character.toLowerCase(c);
        return c;
    }
}

