import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		double h = s.nextDouble();
		double n = s.nextDouble();
		double m =0;
		for(int i = 0;i<n;i++) {
			m += s.nextDouble();
		}
		if(m>=h) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
		
	}
}

