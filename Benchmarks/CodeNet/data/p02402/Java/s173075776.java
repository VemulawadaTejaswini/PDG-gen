import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int max = 0;
		int min = 1000000;
		int sum = 0;
		
		for(int i = 0; i < N; N++) {
			int a = sc.nextInt();
			
			if(a > max){
				max = a;
			}else if(a < min) {
				min = a;
			}
		
			sum = sum + a;
			
		}
		
		System.out.printf("%d %d %d\n",min,max,sum);

	}

}

