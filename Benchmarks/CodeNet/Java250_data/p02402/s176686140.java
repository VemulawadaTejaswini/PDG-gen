import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int a = s.nextInt();
		int min = a;
		int max = a;
		long sum = a;
		
		for(int i=2; i<=n; i++){
			a = s.nextInt();
			if(a < min){
				min = a;
			}
			if(a > max){
				max = a;
			}
			sum += a;
		}
		
		System.out.println(min + " " + max + " " + sum);
		
	}

}