import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String[] sl = s.split("");
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (String si: sl) {
            sb.append(si);
        }
        String sr = sb.reverse().toString();
        if (s.equals(sr) && s.substring(0, n/2).equals(sr.substring((n+1)/2, n))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}