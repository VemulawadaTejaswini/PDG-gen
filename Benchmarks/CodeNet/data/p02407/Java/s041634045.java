import java.util.*;

public class Main{
	
	static void Output(int[] Numbers, int n){
		int i = 0;
		while(true){
			if(i < n-1){
				System.out.print(Numbers[i] + " ");
				i++;
			}
			else if(i==(n-1) ){
				System.out.print(Numbers[i]);
				break;
			}
		
		}
	}
	static void Revers(int[] Numbers , int n){
		
		for(int i = 0; i < n/2 ; i++){
			int t = Numbers[i];
			Numbers[i] = Numbers[n - i -1];
			Numbers[n - i - 1]= t;
		}
		Output(Numbers, n);
		
	}
	
	static void Input(){
		Scanner scanner = new Scanner(System.in);		
		int n 			= scanner.nextInt();
		int[] Numbers	= new int[n];
		for(int i = 0; i < n ; i++){
			Numbers[i] = scanner.nextInt();
		}
		scanner.close();
		Revers(Numbers, n);
		
	}
	
	public static void main(String[] args) {
		Input();
		
	}

}