import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 111 != 0)
            System.out.println(n + 111 - n % 111);
        else
            System.out.println(n);
    }
}