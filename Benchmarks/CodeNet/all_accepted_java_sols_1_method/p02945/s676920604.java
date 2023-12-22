import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());

        int p = A + B;
        int m = A - B;
        int k = A * B;
        int tmp = Math.max(p, m);
        int ans = Math.max(tmp, k);

        System.out.println(ans);
    }

}
