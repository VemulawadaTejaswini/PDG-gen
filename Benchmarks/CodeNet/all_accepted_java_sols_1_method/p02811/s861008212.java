import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int k = sc.nextInt();
        int x = sc.nextInt();
        if (k * 500 >= x) System.out.println("Yes");
        else System.out.println("No");
    }
}