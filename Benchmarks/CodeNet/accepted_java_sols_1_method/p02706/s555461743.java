import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0; i < m; i++) n -= Integer.parseInt(sc.next());
        System.out.println(n < 0 ? -1 : n);
    }
}
