import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		
		int ans = 1000 - n;
		
		ans = ans + 110;
		
		System.out.println(ans);
	}
}
