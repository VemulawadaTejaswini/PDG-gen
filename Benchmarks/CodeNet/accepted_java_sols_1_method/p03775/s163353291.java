import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		long n=scanner.nextLong();
		int min=1000000000;
		for(int i=(int)Math.sqrt(n)+1;i>0;i--) {
			if(n%i==0) {
				min=Math.min(min, (int)Math.max(String.valueOf(i).length(), String.valueOf(n/i).length()));
			}
		}
		System.out.println(min);
	}
}