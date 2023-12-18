import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long x = sc.nextLong();
		long y = sc.nextLong();
		
		long temp = x;
		int count = 0;
		
		while(temp <= y) {
			temp *= 2;
			count++;
		}
		System.out.println(count);
	}

}
