import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        if (n < 2 || n % 2 == 1) {
            System.out.println("No");
            return;
        }
        int size = n / 2;
        String sub = s.substring(0, size);
        StringBuilder sb = new StringBuilder();
        sb.append(sub).append(sb);
        if (sb.toString().equals(s)) {
            System.out.println("Yes");            
        } else {
            System.out.println("No");
        }
        
    }

}
