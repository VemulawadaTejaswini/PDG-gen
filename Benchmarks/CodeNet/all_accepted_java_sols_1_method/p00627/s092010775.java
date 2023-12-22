import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n,sum;
		
		while(true){
			n = sc.nextInt() / 4;
			if(n == 0)break;
			sum = 0;
			
			for(int i = 0; i < n; i++)
				sum += sc.nextInt();
			
			System.out.println(sum);
		}
		sc.close();
	}
}