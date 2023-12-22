import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong();
		if(a%2==0 || b%2==0 || c%2==0) {
			System.out.println(0);
		}else {
			System.out.println(Math.min(a*b, Math.min(a*c, b*c)));
		}
	}
}
