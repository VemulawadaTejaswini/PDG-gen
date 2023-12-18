import java.util.Scanner;

public class Main {
	
	public static void printArray(int[] A){
		int n = A.length;
		for(int i=0; i<n-1; i++){
			System.out.print(A[i]+" ");
		}
		System.out.print(A[n-1]+"\n");
	}

	public static void bubbleSort(int[] A){
		int swapTimes = 0;
		for(int n=A.length-1; n>0; n--){
			for(int i=0; i<n; i++){
				if(A[i]>A[i+1]){
					swap(A,i,i+1);
					swapTimes++;
				}
			}
		}
		printArray(A);
		System.out.println(swapTimes);
	}

	private static void swap(int[] A, int a, int b){
		int t = A[a];
		A[a] = A[b];
		A[b] = t;
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] A = new int[n];
		for(int i=0; i<n; i++){
			A[i] = scan.nextInt();
		}

		scan.close();

		bubbleSort(A);
	}
}
