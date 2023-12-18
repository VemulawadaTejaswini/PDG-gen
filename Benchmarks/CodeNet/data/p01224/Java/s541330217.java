import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			if(n==0){
				break;
			}
			int sum=0;
			for(int i = 1; i <= n/2; i++){
				if(n%i==0){
					sum+=i;
				}
			}
			if(n>sum){
				System.out.println("deficient number");
			}
			else if(n==sum){
				System.out.println("perfect number");
			}
			else{
				System.out.println("abundant number");
			}
		}
		
	}

}