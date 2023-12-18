import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
			
			System.out.println(n*n*n);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}