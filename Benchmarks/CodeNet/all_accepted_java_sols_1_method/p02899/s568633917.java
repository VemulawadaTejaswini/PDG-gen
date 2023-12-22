import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt(); 
		
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		int[] tmp = new int[n];
		
		for(int i = 0; i < n; i++) {
			tmp[a[i]-1] = i+1;
			
		}
		for(int i = 0; i < n; i++) {
			System.out.print(tmp[i]+" ");
		}
		
	}
}
