import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String foc=scan.next();
		String real=scan.next();
		int count=0;
		for(int i=0;i<3;i++) {
			if(foc.charAt(i)==real.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}