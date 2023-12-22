import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
       int a = sc.nextInt()-1;
       int b = sc.nextInt()-1;
       sb.append(sc.next());
       String s1 = sb.substring(b,b+1).toLowerCase();
        sb.setCharAt(b,s1.charAt(0));
        System.out.println(sb);
    }
}
