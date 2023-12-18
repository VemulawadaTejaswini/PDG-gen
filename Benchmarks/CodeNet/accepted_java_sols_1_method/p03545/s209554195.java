import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int a = s[0] - '0';
		int b = s[1] - '0';
		int c = s[2] - '0';
		int d = s[3] - '0';

		if(a+b+c+d ==7) {
			System.out.printf("%d+%d+%d+%d=7",a,b,c,d);
		}else if(a+b+c-d ==7) {
			System.out.printf("%d+%d+%d-%d=7",a,b,c,d);
		}else if(a+b-c+d ==7) {
			System.out.printf("%d+%d-%d+%d=7",a,b,c,d);
		}else if(a+b-c-d ==7) {
			System.out.printf("%d+%d-%d-%d=7",a,b,c,d);
		}else if(a-b+c+d ==7) {
			System.out.printf("%d-%d+%d+%d=7",a,b,c,d);
		}else if(a-b+c-d ==7) {
			System.out.printf("%d-%d+%d-%d=7",a,b,c,d);
		}else if(a-b-c+d ==7) {
			System.out.printf("%d-%d-%d+%d=7",a,b,c,d);
		}else if(a-b-c-d ==7) {
			System.out.printf("%d-%d-%d-%d=7",a,b,c,d);
		}

		sc.close();
	}
}