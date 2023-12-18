import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M1 = sc.nextInt();
        int D1 = sc.nextInt();
        int M2 = sc.nextInt();
        int D2 = sc.nextInt();
        System.out.println(String.format("%d", M1==M2 ? 0 : 1));
    }
}
