import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		int ans[] = new int[1000000];
		
		for(int x = 1; x<N+1; x++) {
			for(int y = 1; y<N+1; y++) {
				for(int z = 1; z<N+1; z++) {
						ans[(x+y+z)*(x+y+z)-x*(y+z)-y*z]++; 
				}
			} 
		}
		
		for(int j =1; j<N+1; j++) {
			System.out.println(ans[j]);
		}
		keyboard.close();	
	}
}
