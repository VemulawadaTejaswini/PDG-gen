import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String head = s.substring(0,1);
		int len = s.length();
		String tail = s.substring(len-1,len);
		String mid = String.valueOf(len-2);
		// 出力
		System.out.println(head + mid + tail);
	}
}