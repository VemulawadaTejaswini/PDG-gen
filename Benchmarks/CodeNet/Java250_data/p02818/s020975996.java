import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long a=sc.nextLong();
		Long b=sc.nextLong();
		Long k=sc.nextLong();
		Long ansA=max(0L,a-k);
		Long ansB=ansA!=0?b:max(0L,b-(k-a));
		print(ansA+" "+ansB);
	}
	
	private static int min(int a, int b) {
		return a<b?a:b;
	}
	
	private static Long min(Long a, Long b) {
		return a<b?a:b;
	}
	
	private static int max(int a, int b) {
		return a>b?a:b;
	}
	
	private static Long max(Long a, Long b) {
		return a>b?a:b;
	}
	
	private static void print(String s) {
		System.out.println(s);
	}

}
