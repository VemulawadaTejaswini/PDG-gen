import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		int i;
		int length = s.length();
		int[] sum = new int[10000];
		for(i = 0; i < length; i++) {
			sum[s.codePointAt(i)]++;
		}
		for(i = 0; i < length; i++) {
			if(sum[s.codePointAt(i)] != 2) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}