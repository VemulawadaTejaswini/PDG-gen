import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 0;
		
		int j = 0;
		
		
		
		for (int waku = 1; waku < 28 && result == 0; waku++){
			j = 0;
			for (int i = waku; i >= 0 && result == 0; i--){
				
				if (n == i * 4 + j * 7){
					result = 1;
				}
				
				j++;
			}
		}
		
		
		
		if (result == 1){
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
