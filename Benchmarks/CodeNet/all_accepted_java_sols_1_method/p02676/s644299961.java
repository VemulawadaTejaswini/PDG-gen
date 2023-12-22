import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int k = sc.nextInt();
		String a = sc.next();
		String b="";
		if (a.length() > k){
			b=a.substring(0,k);
			b+="...";
		}else{
			b=a;
		}
		System.out.println(b);
	}
}
