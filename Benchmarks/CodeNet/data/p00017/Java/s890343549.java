import java.io.*;
import java.util.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            int poor = poor(s);
            for (int i = 0; i < s.length(); i++) {
                if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                    System.out.printf("%c", s.charAt(i) + poor);
                } else {
                    System.out.print(s.charAt(i));
                }
            }
            System.out.println();
        }
    }

    static int poor(String str) {
        Pattern data = Pattern.compile("this|that|the");
        Matcher m;
        String[] array = str.split(" ");
        for (int i = 0; i < array.length; i++) {
            char[] c = array[i].toCharArray();
            int poor = 't' - c[0];
            for (int j = 0; j < c.length; j++) {
                c[j] = (char) (c[j] + poor);
            }
            String s = String.valueOf(c);
            if (data.matcher(s).find()) {
                return poor;
            }
        }
        return 0;
    }
}