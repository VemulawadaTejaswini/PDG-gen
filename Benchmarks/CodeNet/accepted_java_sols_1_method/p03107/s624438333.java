import java.util.Scanner;
public class Main {
	static int A,B,C;
	static String S;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long ans=0;
		int zero=0;
		int one=0;
	S=sc.nextLine();
	String s[]=S.split("");
	for(int i=0;i<S.length();i++) {
		if(s[i].equals("0")) {
			zero++;
		}else {
			one++;
		}
	}
ans=Math.min(zero, one);
ans*=2;
		System.out.println(ans);
	}
}
