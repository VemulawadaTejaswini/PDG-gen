import java.io.PrintWriter;
import java.util.*;
//https://qiita.com/p_shiki37/items/3902f4e3adc3aeb382f1

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        Map<String, String> map = new HashMap<>();
        map.put("Sunny", "Cloudy");
        map.put("Cloudy", "Rainy");
        map.put("Rainy", "Sunny");

        StringBuilder sb = new StringBuilder();
        sb.append(map.get(S));

        PrintWriter out = new PrintWriter(System.out);
        out.println(sb);
        out.flush();
    }
}