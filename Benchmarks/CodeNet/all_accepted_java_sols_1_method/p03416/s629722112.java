import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		for(int i = a; i <= b; i++) {
			String str = String.valueOf(i);
			if(str.charAt(0)==str.charAt(4)&&str.charAt(1)==str.charAt(3)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
