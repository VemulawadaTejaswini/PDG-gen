import java.util.*;

public class Main {
	public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);

        // 整数N
        int num = sc.nextInt();
        // K進数
        int base = sc.nextInt();

        // 出力
        System.out.println(Integer.toString(num, base).length());
    }
}