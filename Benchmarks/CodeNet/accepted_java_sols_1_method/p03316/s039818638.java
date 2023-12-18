import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
 
		int N = scan.nextInt();

		int count = 0;
		int M = N;

		while(M != 0){
			count += M%10;
			M = M/10;
		}
		
		if(N % count == 0){
			System.out.println("Yes");	
		}else{
			System.out.println("No");
		}


	}
 
}