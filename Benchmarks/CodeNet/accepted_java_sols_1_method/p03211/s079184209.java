import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int min = 1000;
		for (int i=0;i<s.length()-2;i++) {
			String temp = s.substring(i,i+3);
			int a= Integer.parseInt(temp);
			if (Math.abs(a-753)<min) {
				min = Math.abs(a-753);
			}
		}
		System.out.println(min);
	}
}