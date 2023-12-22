import java.util.*;

public class Main{
	public static void main(String [] args){
		/*int n,k;
		int arrA[];
		Scanner t = new Scanner(System.in);

		n = t.nextInt();
		k = t.nextInt();
		arrA = new int[n];

		for(int i = 0; i < n; i++){
			int numb = t.nextInt();
			arrA[i] = numb;
		}

		int valor = arrA[k];

		if (valor == 0){
			System.out.println(valor);
		}else{
			int nv = valor - 1;
			System.out.println(nv);
		}*/

		int n, k;
		Scanner t = new Scanner(System.in);
		n = t.nextInt();
		k = t.nextInt();
		
		int resp = n * k;

		System.out.println(resp);
		
	}
	
}