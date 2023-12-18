import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int year = Integer.parseInt(s.substring(0, 4));
        int month = Integer.parseInt(s.substring(5, 7));
        String ans = year < 2020 && month < 5 ? "Heisei" : "TBD";
        System.out.println(ans);
    }
}
