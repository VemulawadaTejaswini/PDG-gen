import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = s.substring(0,4);
        String s2 = s.substring(4);
        System.out.println(s1 + " " + s2);
    }
}