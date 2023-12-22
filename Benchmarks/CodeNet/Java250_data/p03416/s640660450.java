import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int A = sc.nextInt();
        final int B = sc.nextInt();

        int ans = 0;
        for (int i = A; i <= B; i++) {
            String s = String.valueOf(i);
            String reverseS = new StringBuffer(s).reverse().toString();
            if (s.equals(reverseS)) ans++;
        }
        System.out.println(ans);
    }
}
