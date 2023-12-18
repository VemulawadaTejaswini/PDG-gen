import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Character> characters = Arrays.asList('A', 'C', 'G', 'T');
        List<String> commands = Arrays.asList("insert", "find");
        HashMap<Character, List<String>> m = new HashMap<>();
        while(sc.hasNext()) {
            String[] c_s = sc.nextLine().split(" ");
            String c = c_s[0];
            String s = c_s[1];
            if (!commands.contains(c)) {
                return;
            }
            System.out.println(Stream.of(s.split("")).collect(Collectors.toList()));
            if (c.equals("insert")) {
                Character ch = s.charAt(0);
                List<String> ss = m.get(ch);
                if (ss == null) {
                    ss = new ArrayList<>();
                }
                ss.add(s);
                m.put(s.charAt(0), ss);
            }
            if (c.equals("find")) {
                Character ch = s.charAt(0);
                List<String> ss = m.get(ch);
                String y_n;
                if (ss == null) {
                    y_n = "no";
                } else if (ss.contains(s)) {
                    y_n = "yes";
                } else {
                    y_n = "no";
                }
                System.out.println(y_n);
            }
        }
        System.out.println(m);
    }
}


