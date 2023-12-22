
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n--;
		int[] b = new int[n];
		int suma=0;
		for(int i=0;i<n;i++){
			b[i] = sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			suma += Math.min(b[i], b[i+1]);
		}
		suma += b[0];
		suma += b[n-1];
		
		System.out.println(suma);
	}

}
