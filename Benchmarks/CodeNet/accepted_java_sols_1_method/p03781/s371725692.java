import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		long x=sc.nextLong();
		for(int i=1;i<=x;i++) {
			if(i*(i+1)/2>=x) {
				System.out.println(i);
				break;
			}
		}
	}
}
