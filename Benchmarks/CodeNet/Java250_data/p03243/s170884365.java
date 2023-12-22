import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		
		
		for(int i=n;i<=999;i++) {
			String s=String.valueOf(i);
			if(s.charAt(0)==s.charAt(1)&&s.charAt(1)==s.charAt(2)) {
				System.out.println(i);
				return;
			}
		}
	}
}