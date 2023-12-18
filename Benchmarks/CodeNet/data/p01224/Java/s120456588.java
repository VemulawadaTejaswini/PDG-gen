import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System. in);
		for(int j=0;j<1000;j++){
			int n=cin.nextInt(),k=0;
			if(n==0)
				break;
			int r[]=new int[100];

			for(int i=1;i<n;i++){
				if(n%i==0)
					k+=i;
			}
			if(n==k)
				System.out.println("perfect number");
			else if(n>k)
				System.out.println("deficient number");
			else
				System.out.println("abundant number");
		
		}
	}
}