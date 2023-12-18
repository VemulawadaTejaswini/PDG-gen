import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		Sort sort = new Sort();
		arr = sort.insertion(arr);
	}
}

class Sort{
	public int[] insertion(int[] A){
                showArray(A);
		for(int i=1; i<A.length; i++){
			int v = A[i];
			int j = i-1;
			while(j >= 0 && A[j] > v){
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = v;
			showArray(A);
		}
		return A;
	}
	public void showArray(int[] A){
		for(int i=0; i<A.length; i++){
			System.out.print(A[i]);
			if(i != A.length-1)System.out.print(" ");
		}
		System.out.println("");
	}
}