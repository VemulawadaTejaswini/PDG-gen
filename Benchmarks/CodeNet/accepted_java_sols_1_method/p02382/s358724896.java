import java.util.Scanner;
import java.lang.Math.*;
class Main {
	public static void main(String args[]){	
			
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int a[], b[];
		a = new int[n];
		b = new int[n];
		
		double one = 0;
		double two = 0;
		double three = 0;
		double inf = 0;
		
		for(int i = 0;i < n;i++){
			a[i] = scan.nextInt();
		}
			
		for(int i = 0;i < n;i++){
			b[i] = scan.nextInt();
		}		
		
		for(int i = 0; i < n; i++){
			one += Math.abs(a[i] - b[i]);
		}
		
		for(int i = 0; i < n; i++){
			two += Math.pow(Math.abs(a[i] - b[i]), 2);
		}
		two = Math.sqrt(two);
		
		for(int i = 0; i < n; i++){
			three += Math.pow(Math.abs(a[i] - b[i]), 3);
		}
		three = Math.cbrt(three);
		
		for(int i = 0; i < n; i++){
			if(inf < Math.abs(a[i] - b[i])){
				inf = Math.abs(a[i] - b[i]);
			}
		}
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(inf);
	}
		
}