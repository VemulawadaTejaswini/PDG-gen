import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String a = sc.next();
		String b = a.substring(a.length()-1);
		if ("3".equals(b)){
		System.out.println("bon");

		} else if ("0".equals(b)||"1".equals(b)||"6".equals(b)||"8".equals(b)) {
		System.out.println("pon");

		}else{
		System.out.println("hon");

		}
	}
}
