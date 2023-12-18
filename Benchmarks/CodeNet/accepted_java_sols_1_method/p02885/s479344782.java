import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gap = a - 2 * b;

        // 出力
        System.out.println(Math.max(gap, 0));
    }
}