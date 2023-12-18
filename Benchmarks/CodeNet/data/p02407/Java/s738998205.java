import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int a[] = new int[n];
		
		System.out.println(n);
		
		for(int i = 0; i < n; i++){
			a[i] = scan.nextInt();
		}

		for(int j = n; j > 0; j++){
			System.out.print(a[j]);
			if(j != 1){
				System.out.print(" ");
			}
		}
	}
}