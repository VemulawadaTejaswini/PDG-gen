import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < s.length()-1; i++) {
            if (i+2 > s.length()-1) break;

            String tmpStr = s.substring(i, i+3);
            int diff = Math.abs(753 - Integer.valueOf(tmpStr));
            min = Math.min(diff, min);
        }

        System.out.println(min);
    }
}
