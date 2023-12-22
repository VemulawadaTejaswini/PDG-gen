import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int happy = 0;
		
		int ans = x/500;
		x -= 500*ans;
		happy += 1000*ans;
		
		ans = x/5;
		happy += 5*ans;
		
		System.out.println(happy);
		
	}	
}
