import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] s = str.split("");
        int countR = 0;
        int countB = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("0"))
                countR++;
            else
                countB++;
        }
        System.out.println(Math.min(countR, countB) * 2);
    }
}
