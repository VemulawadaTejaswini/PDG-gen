import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		double sum = 0;
		for(int i = 0; i < n; i++){
			a[i] = stdIn.nextInt();
			sum += 1.0/a[i];
		}
		System.out.println(1/sum);
		
		
		
	}

}
