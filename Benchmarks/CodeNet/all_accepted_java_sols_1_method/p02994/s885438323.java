import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		int L  = keyboard.nextInt();
		
		int sum = 0;
		int z = 1000;
		
		for(int i = 1; i < N+1; i++){
			sum += L+i-1;
				if(Math.abs(z) > Math.abs(L+i-1)){
					z = L+i-1;
				}
		}

		System.out.println(sum-z);
		keyboard.close();	
	}
}
