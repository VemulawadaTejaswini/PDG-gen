import java.util.Scanner;


public class MergeSort {
	
	int n;
	int[] A;
	int[] L;
	int[] R;
	int cnt =0;
	
	
	public static void main(String[] args) {
		new MergeSort().solve();
		
	}
	
	public void solve(){
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		A = new int[n];
		L= new int[n/2+5];
		R= new int[n/2+5];
		
		for(int i=0;i<n;i++){
			A[i]= scanner.nextInt();
		}
		mergeSort(0, n);
		solvePrint();
	}
	
	public void merge(int left,int mid,int right){
		int n1 = mid -left;
		int n2 = right -mid;
		
		for(int i=0;i<n1;i++){
			L[i]=A[left +i];
		}
		for(int i=0;i<n2;i++){
			R[i]=A[mid+i];
		}
		L[n1]=Integer.MAX_VALUE;
		R[n2]=Integer.MAX_VALUE;
		int i=0,j=0;
		for(int k=left;k<right;k++){
			if(L[i]<=R[j]){
				A[k]=L[i];
				i++;
			}
			else{
				A[k]=R[j];
				j++;
			}
			cnt++;
		}
	}
	
	public void mergeSort(int left,int right){
		if(left+1<right){
			int mid = (left+right)/2;
			mergeSort(left, mid);
			mergeSort(mid, right);
			merge(left,mid,right);
		}
	}
	
	public void solvePrint(){
		for(int i=0;i<A.length;i++){
			if(i>0){
				System.out.print(" ");
			}
			System.out.print(A[i]);
		}
		System.out.println("");
		System.out.println(cnt);
	}
}