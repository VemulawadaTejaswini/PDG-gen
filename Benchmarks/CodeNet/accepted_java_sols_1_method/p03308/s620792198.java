import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		int max = 0;
		int min = 0;
		
		for (int i=0; i<n; i++){
			a[i] = sc.nextInt();
			
			if (i==0){
				max = a[i];
				min = a[i];
			}
			else {
				if (max < a[i]){
					max = a[i];
				}
				if (min > a[i]){
					min = a[i];
				}
			}
		}
		
		System.out.println(max-min);			
		
	}

}
