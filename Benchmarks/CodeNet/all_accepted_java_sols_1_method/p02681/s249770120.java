import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        String[] t = sc.next().split("");
        boolean flg = true;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(t[i])) {continue;}
            else flg = false;
        }
        if (flg) {System.out.println("Yes");}
        else System.out.println("No");
    }
}