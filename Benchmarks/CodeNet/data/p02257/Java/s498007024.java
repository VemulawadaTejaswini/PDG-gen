import java.util.Scanner;
public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int i, j, k;
		int n = sc.nextInt();
		int a[] = new int[n];
		int count = 0;
		
		for(i = 0; i < n; i++){
			a[i] = sc.nextInt();
			if(prime(a[i]) == 1) count++;
		}
		System.out.println(count);
		
		
	}
	
	public static int prime(int x){
		if(x <= 1) return 0;
		
		for(int i = 2; i < x - 1; i++){
			if(x % i == 0) return 0;
		}
		
		return 1;
	}
}
