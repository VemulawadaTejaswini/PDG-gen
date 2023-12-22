import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        int div = 1;
        for (int i = 0; i < d; i++) div *= 100;
        if (n == 100) n++;
        System.out.println(n * div);
    }
}