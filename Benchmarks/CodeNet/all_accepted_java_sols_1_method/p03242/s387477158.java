import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        s = s.replaceAll("1","a");
        s = s.replaceAll("9","b");
        s = s.replaceAll("a","9");
        s = s.replaceAll("b","1");
        System.out.println(s);
    }
}
