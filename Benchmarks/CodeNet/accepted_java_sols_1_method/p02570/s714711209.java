import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
           int d = sc.nextInt();
           int t = sc.nextInt();
		   int s = sc.nextInt(); // minutes
		   
		   String ans = "Yes";

		   if (s*t < d) {
			   ans = "No";
		   }



           System.out.println(ans);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
