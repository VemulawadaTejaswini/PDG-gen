import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strstr = sc.next();
		char[] str = strstr.toCharArray();
		char[] rs = new char[str.length];
		for(int i=0;i<str.length;i++){
			rs[i] = str[str.length-i-1];
		}
		System.out.println(rs);
	}
}