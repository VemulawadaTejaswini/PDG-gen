import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		if(n==2) {
			System.out.println(s);
		}else if(n==3) {
			StringBuffer str = new StringBuffer(s);
	         String hoge2 = str.reverse().toString();
			System.out.println(hoge2);
		}
		  }
		}