import java.util.Scanner;

class Main
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int min, max;
		long sum;
		
		int a = scan.nextInt();
		min = a;
		max = a;
		sum = a;
		
		for (int i=1; i<n; i++){
			a = scan.nextInt();
			
			if(a < min){
				min = a;}
			if(a > max){
				max = a;}
			sum += a;
			}
			
		System.out.println(min+" "+max+" "+sum);
	}
}
