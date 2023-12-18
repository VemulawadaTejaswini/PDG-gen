import java.util.Scanner;
public class Main {
	static int[] arr = new int[110];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int res = bubbleSort(n);
		print(n);
		System.out.println(res);
		
	}
	
	public static int bubbleSort(int n){
		int cnt = 0;
		boolean f = true;
		for(int i=0;f;i++) {
			f = false;
			for(int j=n-1;j>=i+1;j--) {
				if(arr[j]<arr[j-1]) {
					swap(j);
					f = true;
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	public static void swap(int j) {
		int t = arr[j];
		arr[j] = arr[j-1];
		arr[j-1] = t;
	}
	
	public static void print(int n) {
		for(int i=0;i<n;i++) {
			if(i==0) System.out.print(arr[i]);
			else System.out.print(" "+arr[i]);
		}
		System.out.println();
	}
}
