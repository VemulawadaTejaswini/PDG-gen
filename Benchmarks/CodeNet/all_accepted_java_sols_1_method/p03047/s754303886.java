import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n, k;
		n = teclado.nextInt();
		k = teclado.nextInt();
		int count =0;
		int soma;
		if(k <= n && n <=50 && 1 <= k ) {
			for(int i=k-1; i <n ;i ++) {
				soma=i+i+1;
				count++;
			
			}
		}
		System.out.println(count);

	}

}
