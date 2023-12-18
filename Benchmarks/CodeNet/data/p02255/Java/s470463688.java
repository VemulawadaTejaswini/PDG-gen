//挿入ソート
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int N = stdIn.nextInt();			//数列の長さを入力
		int[] a = new int [N];				//数列の要素
		
		for(int i = 0; i < a.length; i++) {
			a[i] = stdIn.nextInt();
		}
		int v;
		int j;
		
		for(int k = 0; k < a.length - 1 ; k++) {
			System.out.print(a[k] + " ");
		}
		System.out.println(a[a.length - 1]);
		
		for(int i = 1; i < a.length; i++) {
			v = a[i];
			j = i - 1;
			
			while(j >= 0 && a[j] > v) {
				a[j + 1] = a[j];
					j--;
			}
			a[j + 1] = v;
			
			for(int k = 0; k < a.length - 1 ; k++) {
				System.out.print(a[k] + " ");
			}
				System.out.println(a[a.length - 1]);
		}
	}

}

