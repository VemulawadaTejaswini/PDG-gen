import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		
		int ans = 0;
		if(n==1) ans = 2;
		else if(n==0 || n==2) ans = 1;
		System.out.println(ans);
	}
	
}