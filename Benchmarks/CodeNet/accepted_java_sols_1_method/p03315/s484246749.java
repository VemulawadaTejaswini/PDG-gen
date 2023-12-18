import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n=0;
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)=='+')n++;
			if(s.charAt(i)=='-')n--;

			}
		// 出力
		System.out.println(n);
	}
}