import java.util.Scanner;

public class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Main().run();
	}
	
	void isort(int[] a) {
		for(int j = 1; j < a.length; j++) {
			pArray(a);
			int key = a[j];
			int i = j - 1;
			
			while(i >= 0 && a[i] > key) {
				a[i + 1] = a[i];
				i--;
			}
			a[i+1] = key;
		}
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < N; i++)
			arr[i] = sc.nextInt();
		
		isort(arr);
		
		pArray(arr);
	}
	
	boolean isOk(int[] arr) {
		boolean f = true;
		for (int i = 1; i < arr.length; i++) {
			int left = arr[i - 1];
			int right = arr[i];
			if(!(left <= right)) {
				f = false;
				break;
			}
		}
		return f;
	}
	
	void pArray(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int j = a[i];
			System.out.print(j + " ");
		}
		System.out.println(a[a.length - 1]);
	}
}