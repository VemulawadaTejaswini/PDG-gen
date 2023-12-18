import java.util.*;

public class Main {
	public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        
        Integer N = sc.nextInt(); // 数列
        Integer Q = sc.nextInt(); // クエリ

        sc.nextLine();

        sc.close();

        Integer ans = N*Q;

        System.out.println(ans);

    }
}