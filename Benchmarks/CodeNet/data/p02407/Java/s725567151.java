import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer a[] = new Integer[n];
		
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a, Comparator.reverseOrder());
		
		for(int j = 0; j < n; j++){
			if(j == n -1){
				System.out.print(a[j]);
			}else{
				System.out.print(a[j] + " ");
			}
		}
		System.out.println("");
		sc.close();
	}
}