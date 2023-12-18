import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		int ans[] = new int[N+1];
		
		for(int x = 1; x<N+1; x++) {
			for(int y = 1; y<N+1; y++) {
				for(int z = 1; z<N+1; z++) {
					for(int i =1; i<N+1; i++) {
						if(x*x + y*y + z*z +x*y +y*z + z*x == i) {
						ans[i]++; 
						}
					}
				}
			} 
		}
		
		for(int j =1; j<N+1; j++) {
			System.out.println(ans[j]);
		}
		keyboard.close();	
	}
}