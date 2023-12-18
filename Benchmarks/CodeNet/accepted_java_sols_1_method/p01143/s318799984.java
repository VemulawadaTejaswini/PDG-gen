import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextDouble()){
			int N = sc.nextInt();
			int M = sc.nextInt();
			int P = sc.nextInt();
			if(N==0 && M==0 && P==0)break;
			
			double sum = 0;
			int set = 0;
			int X = 0;
			for(int i = 1; i <= N; i++){
				X = sc.nextInt();
				sum += X * (100 - P);
			if(i == M)set = X;
			}
			sum = sum / set;
			if(set == 0)
				System.out.println(0);
			else
				System.out.println((int)Math.floor(sum));
		}
		}
}