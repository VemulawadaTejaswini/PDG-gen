import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c1 = sc.next();
        String c2 = new StringBuffer(sc.next()).reverse().toString();
        System.out.println(c1.equals(c2)?"YES":"NO");
    }
}
