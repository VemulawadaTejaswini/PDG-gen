import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        long k = in.nextLong();
        int pos = 0;
        while(pos < s.length() && s.charAt(pos) == '1') pos++;
        if(k <= pos) {
            System.out.println(1);
        } else {
            System.out.println(s.charAt(pos));
        }
    }
}
