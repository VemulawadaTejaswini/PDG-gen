import java.util.Scanner;

class Main{
    public static int[] L;
    public static int[] R;
    public static int count = 0;
    
    public static void mergeSort(int A[], int left, int right){
	
	if( (left+1) < right ){
	    
	    int mid = (left + right)/2;
	    mergeSort(A, left, mid);
	    mergeSort(A, mid, right);
	    merge(A, left, mid, right);
	}	
    }
    
    public static void merge(int A[], int left, int mid, int right){
	int i,j;
	int n1 = mid - left;
	int n2 = right - mid;

	for(i=0 ; i<n1 ; i++){
	    L[i] = A[left + i];
	}
	for(j=0 ; j<n2 ; j++){
	    R[j] = A[mid + j];
	}

	L[n1] = 2147483647;
	R[n2] = 2147483647;
	i = 0;
	j = 0;

	for(int k=left ; k<right ; k++){
	    if(L[i] <= R[j]){
		count++;
		A[k] = L[i];
		i++;
	    }
	    else {
		count++;
		A[k] = R[j];
		j++;
	    }
	}
    }
    
    public static void main(String[] args){
	L = new int[500000];
	R = new int[500000];
	int i;
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int A[] = new int[500000];
	for(i=0 ; i<n ; i++){
	    A[i] = scan.nextInt();
	}

	mergeSort(A, 0, n);
	for(i=0 ; i<n-1 ; i++){
	    System.out.print(A[i]+" ");
	}
	System.out.println(A[i]);
	System.out.println(count);
	
	
    }

    
    
    
    
    
}


