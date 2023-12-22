import java.util.Scanner;

public class Main {
	static long toLong(double N) {
			long num=(long)(N*100+0.001);
			return num;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A=sc.nextLong();
		double B=sc.nextDouble();
		sc.close();
		long result=Math.floorDiv(A*toLong(B),100l);
		System.out.println(result);
	}
}
