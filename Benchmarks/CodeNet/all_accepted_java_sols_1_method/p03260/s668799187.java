import java.util.*;

public class Main{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String answer = "No";

		for(int i=1; i<=3; i++){
			if(i*A*B%2 == 1){
				answer = "Yes";
			}
		}
				
					
		System.out.println(answer);
		

	}						
	
}
