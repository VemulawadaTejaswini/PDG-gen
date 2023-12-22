import java.util.*;

public class Main {
    //Changing a Character
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        System.out.println(sln(k, s));
    }

    public static String sln(int k, String s) {
        String res = s.substring(0, k - 1) + (s.charAt(k - 1) + "").toLowerCase() + s.substring(k);
        return res;
    }
}