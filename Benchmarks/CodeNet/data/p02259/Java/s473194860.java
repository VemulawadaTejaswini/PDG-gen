import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] a = new int[n];
	
		for(int i = 0; i < n; i++){
			a[i] = scan.nextInt();
		}
	
		boolean flag = true;
		int swap;
		int count = 0;
		
		while(flag){
			flag = false;
			for(int i = n-1; i >= 1; i--){
				if(a[i] < a[i-1]){
					swap = a[i];
					a[i] = a[i-1];
					a[i-1] = swap;
					count++;
					flag = true;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(a[i]);

			if(i != n-1) System.out.print(" ");
		}
		System.out.println();
		System.out.println(count);
	}
}