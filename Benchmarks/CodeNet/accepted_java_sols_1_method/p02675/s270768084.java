import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = Integer.parseInt(s.substring(s.length()-1));

        System.out.println(a == 3 ? "bon" : (a == 0 || a == 1 || a == 6 || a == 8) ? "pon" : "hon");
        sc.close();

    }

}
