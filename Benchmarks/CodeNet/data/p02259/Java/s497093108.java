
import java.util.Scanner;
class Main {
	
	static void aryPrint(int[] a) {
		for(int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(a[a.length - 1]);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int[] a = new int [n];
		int count = 0;
		
		for(int i = 0; i < a.length; i++) {
			a[i] = stdIn.nextInt();
		}
		int i = 0;
		int flag = 1;		//逆の隣接する要素が存在する
		while(flag == 1){
			flag = 0;
			for(int j = a.length - 1; j - 1 >= i; j--) {
				if(a[j] < a[j - 1]) {
					int t = a[j];
					a[j] = a[j - 1];
					a[j - 1] = t;
					flag = 1;
					count++;
				}
			}
			i++;
		}
		aryPrint(a);
		System.out.println(count);
	}

}

