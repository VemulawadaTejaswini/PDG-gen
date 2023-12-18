import java.util.Scanner;
class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int num;
		int min, max;
		min = max = 0;
		int sum = 0;
		
		for( int i = 1; i < n; ++ i ) {
			int num = scanner.nextInt();
			if(min > num){
				min = num;
			}
			if(max < num){
				max = num;
			}
			sum += a;
		}	
		System.out.println(min+""+max+""+sum);
	}
}