import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        for (int i=0;i<c.length;i++) {
            if (c[i] == '?') c[i] = 'D';
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<c.length;i++) {
            sb.append(c[i]);
        }
        System.out.println(sb);
    }
}