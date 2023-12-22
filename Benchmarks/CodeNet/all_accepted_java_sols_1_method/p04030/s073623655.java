import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        LinkedList<String> ans = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '0':
                    ans.add("0");
                    break;
                case '1':
                    ans.add("1");
                    break;
                case 'B':
                    if (!ans.isEmpty()) {
                        ans.removeLast();
                    }
                    break;
            }
        }

        for (String val: ans) {
            System.out.print(val);
        }
    }
}
