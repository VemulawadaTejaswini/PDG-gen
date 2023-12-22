import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            HashSet<Integer> hs = new HashSet<Integer>();

            final String[] sl = s.split(" ");

            hs.add(Integer.parseInt(sl[0]));
            hs.add(Integer.parseInt(sl[1]));
            hs.add(Integer.parseInt(sl[2]));

            System.out.println(hs.size());
        }
    }
}
