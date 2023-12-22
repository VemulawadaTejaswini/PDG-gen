import java.io.*;
import java.util.HashMap;
import java.util.List;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        HashMap<String, Integer> cnt = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String v = in.readLine();
            cnt.put(v, cnt.getOrDefault(v, 0) + 1);
        }
        List<String> ac = List.of("AC", "WA", "TLE", "RE");
        for(String s : ac) {
            int c = cnt.getOrDefault(s, 0);
            System.out.println(s + " x " + c);
        }
    }
}
