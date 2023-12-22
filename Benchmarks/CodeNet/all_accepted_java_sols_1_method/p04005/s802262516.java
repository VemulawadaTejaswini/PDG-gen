import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();

		long max = Math.max(a, b);
		max = Math.max(max, c);
		long oneSide;

		if(max == a){
			oneSide = b*c;
		}else if(max == b){
			oneSide = a*c;
		}else{
			oneSide = a*b;
		}

		long mid = max/2;
		System.out.println((max-mid-mid)*oneSide);
	}
}
