import java.util.*;
import java.util.regex.*;

public class Main {
    private static final String[] TERM = {"JOI", "IOI"};

    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            while(scn.hasNext()) {
                String str = scn.next();
                for(int i = 0; i < TERM.length; i++) {
                    Pattern p = Pattern.compile(TERM[i]);
                    Matcher m = p.matcher(str);
                    int sum = 0;
                    for(int idx = 0; m.find(idx); idx = -~m.start()) {
                        sum++;
                    }
                    System.out.println(sum);
                }
            }
        }
    }
}