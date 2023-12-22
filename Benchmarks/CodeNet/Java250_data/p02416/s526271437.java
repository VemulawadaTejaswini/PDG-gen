import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        while (true) {
            String s = sc.next();
            if (s.equals("0")) break;
            calc(s);
        }
    }
    
    private static void calc(String s) {
        int ret = 0;
        for (int i = 0;i < s.length();i++) {
            ret += Integer.parseInt(s.substring(i, i+1));
        }
        System.out.println(ret);
    }
}

