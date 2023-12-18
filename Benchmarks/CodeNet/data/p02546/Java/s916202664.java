import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        if (s.charAt(s.length() - 1) == 's') System.out.println(s + "es");
        else System.out.println(s + "s");
    }
}
