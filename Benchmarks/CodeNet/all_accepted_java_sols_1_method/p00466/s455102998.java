import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int sum;
		
		while(true){
		sum = sc.nextInt();
		if(sum == 0)break;
		
		for(int i = 0; i < 9; i++)
			sum -= sc.nextInt();
		
		System.out.println(sum);
	}
		sc.close();
	}
}