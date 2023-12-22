import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int a[] = new int[1001];
		int temp;
		
		for (int i = 0; i < n; i++){
			a[i] = scan.nextInt();
		}
		
		for (int i = 0; i < n; i++){
			for (int j = i + 1; j != n; j++){
				if (a[i] > a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < n; i++){
			if (i == n-1) {
				System.out.printf("%d\n", a[i]);
			}
			else {
				System.out.printf("%d ", a[i]);
			}
		}
	}
}