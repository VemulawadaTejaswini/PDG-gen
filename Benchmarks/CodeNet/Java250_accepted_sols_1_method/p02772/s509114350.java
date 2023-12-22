import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = 0; 
		boolean flag = true;
		
		for(int i = 0; i < n; i++){
			x = scan.nextInt();
			if(x%2 == 0)
				if(x%3 != 0 && x%5 != 0)
					flag = false;
		}
		
		System.out.println(flag?"APPROVED":"DENIED");
		
	}
}