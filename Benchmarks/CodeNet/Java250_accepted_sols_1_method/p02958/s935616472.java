import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int counter= 0;
		int n = in.nextInt();
		int[] ara = new int[n];
		int[] temp_array = new int[n];
		
		for(int i = 0;i<ara.length;i++) {
			ara[i] = in.nextInt();
			temp_array[i] = ara[i];
		}
		Arrays.sort(temp_array);
		
		
		for(int i = 0;i<ara.length;i++) {
			if(temp_array[i] != ara[i]) {
			 counter++;
			}
		}
	
		
		if(counter<=2) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		

	}

}
