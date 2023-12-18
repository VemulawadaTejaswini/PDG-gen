import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int w = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (count % w == 0) {
                sb.append(s.charAt(i));
            }
            count ++;
        }
        System.out.println(sb.toString());
    }
}