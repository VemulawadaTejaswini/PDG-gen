import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int hituji = Integer.parseInt(s[0]);
        int okami = Integer.parseInt(s[1]);
        if (hituji > okami) {
            System.out.println("safe");
        } else {
            System.out.println("unsafe");
        }
    }
}