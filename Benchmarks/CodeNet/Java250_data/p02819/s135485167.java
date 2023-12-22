import java.util.*;

public class Main{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int X =sc.nextInt();
		int min = 0;
		while(true) {
			
			boolean ans = Prime(X);
			
			if(ans == true) break;
			
			X++;
		}
		
		System.out.print(X);
		
		
		
	}
	static boolean Prime(int X) {
		int flag = 0;
		if(X == 2) {
			return true;
		}else {
			for(int i = 2; i < X; i++) {
				if(X % i == 0) {
					flag = 1;
					break;
				}
				
			}
			if(flag == 1) return false;
			
			return true;
		}
		
	}
	

}