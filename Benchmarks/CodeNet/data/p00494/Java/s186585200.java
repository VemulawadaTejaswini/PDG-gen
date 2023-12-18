import java.util.*;

public class Main {
    private static final char[] CHARLIST = {'J', 'O', 'I'};

    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            String str = scn.next();
            for(int len = str.length() / 3; len > 0; len--) {
                StringBuilder sb = new StringBuilder();
                char[] buf = new char[len];
                for(int i = 0; i < CHARLIST.length; i++) {
                    Arrays.fill(buf, CHARLIST[i]);
                    sb.append(buf);
                }
                if(str.indexOf(sb.toString()) >= 0) {
                    System.out.println(len);
                    break;
                }
            }
        }
    }
}