import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> map = new HashMap<>();
        char c = 'a';
        for (int i = 0; i < 26; i++) {
            map.put((char) (c + i), 0);
        }
        char[] c_array;
        String str;
        do {
            str = br.readLine();
            c_array = str.toCharArray();
            for (char dc : c_array) {
                if ('A' <= dc && dc <= 'Z') {
                    dc = (char) (dc - 'A' + 'a');
                }
                if (map.containsKey(dc)) {
                    map.put(dc, map.get(dc) + 1);
                }
            }
        } while (!str.equals(""));

        for (int i = 0; i < 26; i++) {
            System.out.println((char) ('a' + i) + " : " + map.get((char) ('a' + i)));
        }
    }
}