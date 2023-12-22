import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hituji = sc.nextInt();
        int okami = sc.nextInt();
        if (hituji > okami) {
            System.out.println("safe");
        } else {
            System.out.println("unsafe");
        }
    }
}