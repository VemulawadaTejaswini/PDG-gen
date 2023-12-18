import java.util.Scanner;

class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long sum=0;
		for(char c:s.toCharArray()) {
			sum+=Long.valueOf(c);
		}
		if(sum%9==0) System.out.println("Yes");
		else System.out.println("No");
		System.out.println(sum);
		sc.close();
	}
}