import java.util.Scanner;

public class Main {
	
	public static void printArray(int[] A){
		for(int i=0; i<A.length-1; i++){
			System.out.print(A[i]+" ");
		}
		System.out.println(A[A.length-1]);
	}

    public static void insertionSort(int[] A){
        for(int i=1; i<A.length; i++){
            int key = A[i];
            int j = i-1;
            while(j>-1 && A[j]>key){
                A[j+1]=A[j];
                j--;
            }
            A[j+1]=key;
            printArray(A);
        }
        
    }

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] A = new int[n];
		for(int i=0; i<n; i++){
			A[i] = scan.nextInt();
		}

		scan.close();
		
		printArray(A);
		insertionSort(A);

	}
}
