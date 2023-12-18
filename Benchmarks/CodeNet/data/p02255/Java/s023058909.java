import java.util.Scanner;
public class Main {
	static int[] arr = new int[110];
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		print(n);
		insertSort(n);
	}
	
	public static void insertSort(int n){
		int v,j;
		for(int i=1;i<n;i++){
			v = arr[i];
			j = i - 1;
			while(j>-1&&arr[j]>v){
				arr[j+1] = arr[j--];
			}
			arr[j+1] = v;
			print(n);
		}
	}
	public static void print(int n){
		for(int i=0;i<n;i++){
			if(i!=n-1) System.out.print(arr[i]+" ");
			else System.out.print(arr[i]);
		}
		System.out.println();
	}
}
