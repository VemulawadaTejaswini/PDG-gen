import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long ans = s.chars().filter(c -> c == '1').count();
        System.out.println(ans);
    }
}