import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int A= keyboard.nextInt();
		int B= keyboard.nextInt();
		int C= keyboard.nextInt();
		int D= keyboard.nextInt();
		
		String ans = "No";
		int countT = 0;
		int countA = 0;
		
		while(A>0) {
			A -= D;
			countT++;
		}
		while(C>0) {
			C -= B;
			countA++;
		}
		
		if(countT >= countA) {
			ans = "Yes";
		}
		
		
		System.out.println(ans);
		keyboard.close();	
		
	}
}
