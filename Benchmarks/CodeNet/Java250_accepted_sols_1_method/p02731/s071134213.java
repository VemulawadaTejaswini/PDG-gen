import java.util.*;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		double a = sc.nextDouble() / 3;
        double ans = a * a * a;
        System.out.println(String.format("%.12f", ans));
    }
}