import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();

		String ans;
		if(a > x)
			ans = "NO";
		else if((x-a) <= b) 
			ans = "YES";
		else
			ans = "NO";	
		
		System.out.println(ans);
	}
}