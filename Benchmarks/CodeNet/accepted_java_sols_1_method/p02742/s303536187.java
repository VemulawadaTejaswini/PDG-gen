import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long H=sc.nextLong();
		long W=sc.nextLong();
		if(H==1||W==1) {
			System.out.println(1);
			System.exit(0);
		}
		if(H*W%2==1) {
			System.out.println(H*W/2+1);
		}else {
			System.out.println(H*W/2);
		}
	}
}
