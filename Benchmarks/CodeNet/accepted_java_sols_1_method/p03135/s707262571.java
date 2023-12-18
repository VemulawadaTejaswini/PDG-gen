import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int X = sc.nextInt();
        double r = (double)T / (double)X;
        System.out.println(String.format("%1$.10f", r));
    }
}
