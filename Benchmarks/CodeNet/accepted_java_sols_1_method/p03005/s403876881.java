import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, k;
		
		int i =0;
		
		
		n=teclado.nextInt();
		k=teclado.nextInt();
		if(1 <= k && k <=n && n <=100) {
		i = (n%k);
		System.out.println(i);
			
		}
		}
	
	}