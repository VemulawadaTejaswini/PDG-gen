import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			while(sc.hasNext()) {
				int N=sc.nextInt();
				if(N==0) break;
				int sum=0;
				for(int i=1; i<N; i++) {
					if(N%i==0) {
						sum+=i;
					}
				}
				if(N==sum) {
					System.out.println("perfect number");
				}else if(N<sum) {
					System.out.println("abundant number");
				}else {
					System.out.println("deficient number");
				}
				
			}

			
		}
	}
} 
