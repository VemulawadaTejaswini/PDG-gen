
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n];

		for(int h = 0; h < n; h++){
			a[h] = sc.nextInt();
		}

		for(int i = 0; i < n - 1; i++){
			int min = a[i];
			int pos = i;

			for(int j = i+1; j < n; j++){
				if(a[j] < min){
					min = a[j];
					pos = j;
				}
			}

			int tmp = a[i];
			a[i] = min;
			a[pos] = tmp;
		}

		for(int k = 0; k < n; k++){
			System.out.printf("%d ",a[k]);
		}

		System.out.print("\n");
	}
}