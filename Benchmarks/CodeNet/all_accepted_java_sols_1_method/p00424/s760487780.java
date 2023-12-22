import java.util.Scanner;
import java.util.HashMap;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile("^.+$");
        StringBuilder sb;
        while(true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            sb = new StringBuilder();
            HashMap<String, String> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(sc.next(), sc.next());
            }
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                String s = sc.next();
                if (map.containsKey(s)) {
                    sb.append(map.get(s));
                } else {
                    sb.append(s);
                }
            }
            System.out.println(sb.toString());
        }
    }
}