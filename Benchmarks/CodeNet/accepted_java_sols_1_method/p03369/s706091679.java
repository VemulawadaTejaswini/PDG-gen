import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int cnt=0;
		
		for(int i=0;i<3;i++) {
			if(s.charAt(i)=='o')cnt++;
		}
		
		System.out.println(700+cnt*100);
	}
}
