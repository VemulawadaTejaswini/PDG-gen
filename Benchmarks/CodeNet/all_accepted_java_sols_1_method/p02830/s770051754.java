import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String line = sc.next();
		char[] s = line.toCharArray();
		line = sc.next();
		char[] t = line.toCharArray();
		String ans = "";
		for(int i = 0; i < n; i++){
			ans += s[i];
			ans += t[i];
		}
		System.out.println(ans);
	}
}