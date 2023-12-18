import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int num = stdin.nextInt();
		
		int a[] = new int[20000];
		int max = 0;
		int min = 0; 
		int sum = 0;
	
		for(int i = 0; i < num; i++) {
			a[i] = stdin.nextInt();
		}
		
		max = a[0];
		min = a[0];
		
		for (int i = 0; i < num; i++) {
			if(max < a[i]) {
				max = a[i];
			} else if (min > a[i]) {
				min = a[i];
			}
			
			sum = a[i] + 1;
		}
		
		System.out.println(min + max + sum);
		
		stdin.close();
	}

}