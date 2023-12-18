import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer a[] = new Integer[n];
		
		Arrays.sort(a, Comparator.reverseOrder());
		
		for(int i = 0; i < n; i++){
			if(i == n -1){
				System.out.print(i);
			}else{
				System.out.print(i + " ");
			}
		}
		System.out.println("");
		sc.close();
	}
}