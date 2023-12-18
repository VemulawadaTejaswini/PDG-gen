import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        StringBuffer sb = new StringBuffer(n);
        if (n.equals(sb.reverse().toString() )) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}