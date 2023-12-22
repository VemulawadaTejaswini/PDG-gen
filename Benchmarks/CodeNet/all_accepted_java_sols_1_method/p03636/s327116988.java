import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = s.length();

        System.out.print(s.charAt(0));
        System.out.print(n-2);
        System.out.println(s.charAt(n-1));
    }
}

