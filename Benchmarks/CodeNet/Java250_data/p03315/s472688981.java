import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		
		int ans=0;
		for(int i=0;i<4;i++) {
			ans=(s.charAt(i)=='+')?ans+1:ans-1;
		}
		
		System.out.println(ans);
	}
}
