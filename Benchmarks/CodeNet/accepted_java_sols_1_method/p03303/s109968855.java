import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int w = sc.nextInt();
        String t = "";
        for (int i = 0 ; i < s.length() ; i++) {
            if (i % w == 0) t += s.charAt(i);
        }
        System.out.println(t);
    }
}