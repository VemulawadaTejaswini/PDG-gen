import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());

        int ans = A < 10 && B < 10 ? A * B : -1;
        System.out.println(ans);

    }
}