import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            Map<String, String> m = new HashMap<>();
            while (n-- > 0) {
                m.put(sc.next(),sc.next());
            }
            n = sc.nextInt();
            StringBuffer sb=new StringBuffer();
            while(n-->0) {
                String s=sc.next();
                if(m.containsKey(s)) {
                    sb.append(m.get(s));
                }else {
                    sb.append(s);
                }
            }
            System.out.println(sb);
        }
    }
}

