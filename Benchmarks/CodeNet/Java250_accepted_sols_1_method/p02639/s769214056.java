import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int[] A = new int[5];
		
		for(int i=0; i<5; i++) {
			A[i] = keyboard.nextInt();
		}
		
		int ans =0;
		for(int j=0; j<5; j++) {
			if(A[j] == 0) {
				ans = j+1;
				break;
			}
		}
		
		System.out.println(ans);
		keyboard.close();	
	}
}
