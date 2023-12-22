import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] c = s.split("");
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < s.length(); i += 2) {
            if (c[i].equals("0"))
                countA++;
        }
        for (int i = 1; i < s.length(); i += 2) {
            if (c[i].equals("1"))
                countA++;
        }
        for (int i = 0; i < s.length(); i += 2) {
            if (c[i].equals("1"))
                countB++;
        }
        for (int i = 1; i < s.length(); i += 2) {
            if (c[i].equals("0"))
                countB++;
        }
        System.out.println(Math.min(countA, countB));
    }
}
