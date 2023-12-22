import java.util.Scanner;

public class Main {
  
  	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		boolean ans = true;
		int N = sc.nextInt();
		
		for(int i=0;i<N;i++){
			int a = sc.nextInt();
			if((a % 2 == 0) && ((a % 3 != 0) && (a % 5 != 0))){
				ans = false;
				break;
			}
		}
		
		if(ans){
			System.out.println("APPROVED");
		}
		else{
			System.out.println("DENIED");
		}
	}
	
}