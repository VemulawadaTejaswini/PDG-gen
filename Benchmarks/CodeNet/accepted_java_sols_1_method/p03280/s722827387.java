import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        sc.close();

        int ans = (A - 1) * (B - 1);
        System.out.println(ans);
    }
}