import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long min = 0,max = 0,sum = 0;
		
		for(int i = 0;i < N;i++){
			long a = sc.nextInt();
			sum += a;
			if(i == 0){
				min = a;
				max = a;
			}
			if(max < a)
				max = a;
			if(min > a)
				min = a;
			
		}
		System.out.println(min+" "+max+" "+sum);
	}
}