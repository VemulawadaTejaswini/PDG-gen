import java.util.Scanner;

public class Main{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int n=cin.nextInt();
			if(n==0)break;
			int cnt=0;
			for(int i=1;i*i<n;i++){
				if(n%i==0){
					cnt+=i;
					if(n/i!=i&&n/i!=n)
						cnt+=n/i;
				}
			}
			if(n>cnt){
				System.out.println("deficient number");
			}
			else if(n<cnt){
				System.out.println("abundant number");
			}
			else{
				System.out.println("perfect number");
			}
		}
		
	}

}