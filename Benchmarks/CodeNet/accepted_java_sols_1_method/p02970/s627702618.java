import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N = keyboard.nextInt();
		int D = keyboard.nextInt();
		
		int ans = N/(D*2+1);
		
		if(N%(D*2+1) == 0) { 
			System.out.println(ans);
		}else{
			System.out.println(ans+1);
		}
		keyboard.close();	
	}
}
