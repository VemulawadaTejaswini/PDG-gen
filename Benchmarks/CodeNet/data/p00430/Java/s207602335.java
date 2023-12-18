import java.util.Scanner;


public class Main{
	private int[] a;
	
	public Main(){
		Scanner scanner = new Scanner(System.in);
		int n;
		
		while((n = scanner.nextInt()) > 0){
			a = new int[n + 1];
			
			hoge(n, n, 0);
		}
	}
	private void hoge(int n, int k, int i){
		if(n == 0){
			System.out.print(a[0]);
			
			for(int j = 1; a[j] > 0; j ++)
				System.out.print(" " + a[j]);
			System.out.println();
			
			return;
		}
		for(int j = Math.min(n, k); j > 0; j --){
			a[i] = j;
			
			hoge(n - j, j, i + 1);
			
			a[i] = 0;
		}
	}
	public static void main(String[] args){
		Main main = new Main();
	}
}