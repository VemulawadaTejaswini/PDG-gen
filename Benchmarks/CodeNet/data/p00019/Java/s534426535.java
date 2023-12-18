import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner	sc	= new Scanner(System.in);
		int		n	= sc.nextInt();
		sc.close();

		System.out.println(fact(n));
		
	}
	
	static int fact(int x){
		int sum=1;
		if(x==0){
			return 1;
		}else{
			for(int i=x; i>0; i--){
				sum *= i;
			}
			return sum;
		}
	}
}