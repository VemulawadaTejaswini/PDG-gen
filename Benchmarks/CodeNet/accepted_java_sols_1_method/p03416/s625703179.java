import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int count = 0;
		
		for(int i = A; i <= B; i++) {
			String As = new Integer(i).toString();
			StringBuffer Asb = new StringBuffer(As);
			String AsbR = Asb.reverse().toString();
			if(As.equals(AsbR)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
