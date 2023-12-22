import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			double t = sc.nextInt();
			double x = sc.nextInt();
			
			double y = t/x;
 
			System.out.println(y);
 
		} finally {
			sc.close();
		}
	}
}