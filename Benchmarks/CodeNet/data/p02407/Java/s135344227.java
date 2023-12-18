import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int a[] = new int[n];
		
		for(int i = 0; i < n; i++){
			a[i] = scan.nextInt();
		}

		for(int j = 0; j < n / 2; j++){
			int t = a[j];
			a[j] = a[n - j - 1];
			a[n - j - 1] = t;
		}

		for(int k = 0; k < n; k++){
			System.out.print(a[k]);
			if(k != n - 1){
				System.out.print(" ");
			}else{
				System.out.print();
			}
		}
	}
}