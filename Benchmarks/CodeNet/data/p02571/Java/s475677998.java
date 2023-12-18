import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		solve2();
	}
	public static void solve2() {
		String s = sc.next();
		String t = sc.next();

		int max=0;
		int count=0;
		int tidx=0;
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)==t.charAt(tidx)){
				count++;
				max=Math.max(count, max);
				tidx++;
			}else{
				count=0;
				tidx=0;
			}
		}
		System.out.println(t.length()-max);

	}
}
