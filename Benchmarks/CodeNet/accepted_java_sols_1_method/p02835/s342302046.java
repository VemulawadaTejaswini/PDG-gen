import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A1 = sc.nextInt();
		int A2 = sc.nextInt();
		int A3 = sc.nextInt();
		sc.close();
		String ans = "";
		if(A1 + A2 + A3 >= 22) ans = "bust";
		else ans = "win";
		
		System.out.println(ans);
	}
}