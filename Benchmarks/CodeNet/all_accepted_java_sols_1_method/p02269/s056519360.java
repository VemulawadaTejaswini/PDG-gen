import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        HashSet<String> dictionary = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s = in.readLine();
            if (s.contains("insert")) {
                dictionary.add(s.substring(7));
            } else if (s.contains("find")) {
                if (dictionary.contains(s.substring(5))) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}

