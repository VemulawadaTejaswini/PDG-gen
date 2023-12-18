import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			if(n==1){
				System.out.println("deficient number");
			}else if(n>1){
				int sum = 1;
				for(int i=2;i*i<=n;i++){
					if(n%i==0){
						if(i*i==n) sum += i;
						else sum += i + n/i;
					}
					if(sum>n)break;
				}
				if(n==sum) System.out.println("perfect number");
				else if(n<sum) System.out.println("abundant number");
				else System.out.println("deficient number");
			}
		}
	}	
}