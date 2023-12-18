import java.util.*;
public class Merge_sort{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int count;
	int n=sc.nextInt();
	int[] S=new int[n];
	for(int i=0;i<n;i++){
	    S[i]=sc.nextInt();
	}
	count=mergeSort(S,0,n);
	for(int i=0;i<n-1;i++){
	    System.out.print(S[i]+" ");
	}
	System.out.println(S[n-1]);
	System.out.println(count);
    }
    public static int merge(int[] A,int left,int mid,int right){
	int n1 = mid - left;
	int n2 = right - mid;
	int count=0;
	int[] L=new int[n1+1];
	int[] R=new int[n2+1];
	for(int i=0;i<n1;i++){
	    L[i] =A[left + i];
	}
	for(int i=0;i<n2;i++){
	    R[i] = A[mid + i];
	}
	L[n1]=Integer.MAX_VALUE;
	R[n2]=Integer.MAX_VALUE;
	int i=0;
	int j=0;
	for(int k=left;k<right;k++){
	    if(L[i]<=R[j]){
		A[k] = L[i];
		i+=1;
		count++;
	    }else{
		A[k]=R[j];
		j+=1;
		count++;
	    }
	}
	return count;
    }
    public static int mergeSort(int[] A,int left,int right){
	int c;
	if(left+1<right){
	    int mid=(left+right)/2;;
	    c=mergeSort(A,left,mid);
	    c+=mergeSort(A,mid,right);
	    c+=merge(A,left,mid,right);
	    return c;
	}else{
	    return 0;
	}
    }
}
