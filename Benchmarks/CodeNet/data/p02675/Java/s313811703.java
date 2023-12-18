import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int r = N % 10;
        if (r == 3) System.out.print("bon");
        else if (r <= 1 || r == 6 || r == 8) System.out.print("pon");
        else System.out.print("hon");
    }
}