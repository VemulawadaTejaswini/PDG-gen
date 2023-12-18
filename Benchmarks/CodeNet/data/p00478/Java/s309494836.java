import java.util.*;

public class Main {
	public static void main(String[] args) {
		new Main().AOJ0555();
	}
	Scanner sc = new Scanner(System.in);	
	
	void AOJ0555(){
		String search  = sc.next();
		int n = sc.nextInt();
		String[] rings = new String[n];
		
		String input;
		for(int i = 0; i < n; i++){
			input = sc.next();
			rings[i] = input+input;
		}
		
		int result = 0;
		
		for(int i = 0; i < n; i++){
			if(rings[i].indexOf(search) != -1){
				result++;
			}
		}
		
		System.out.println(result);
		
		
	}
	
}