import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int p = sc.nextInt();
		
		int pieces = 3*a + p;
		ans = pieces/2;
		
		System.out.println(ans);
	}
}
