import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String a = sc.next().replaceAll("1", "a").replaceAll("9", "1").replaceAll("a", "9");
        
		System.out.println(a);
	}
}