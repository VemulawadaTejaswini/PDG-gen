import java.util.*;
public class Main {
	
	static int cmp=0;
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),A[]=new int[n];
		
		for(int i=0;i<n;i++)A[i]=Integer.parseInt(in.next());
		
		margeSort(A,0,A.length-1);
		for(int i=0;i<n-1;i++)System.out.print(A[i]+" ");
		System.out.println(A[n-1]);
		System.out.println(cmp);
	}
	
	static void margeSort(int A[],int left,int right) {
		int middle=(left+right)/2;
		if(left<right) {
			margeSort(A,left,middle);
			margeSort(A,middle+1,right);
		}
		else return;
		
		int k=left,l=middle+1,cnt=0,B[]=new int[right-left+1];
		while(k<=middle && l<=right) {
			if(A[k]<=A[l])B[cnt++]=A[k++];
			else B[cnt++]=A[l++];
			cmp++;
		}
		
		while(k<=middle) { 
			B[cnt++]=A[k++];
			cmp++;
		}
		while(l<=right) {
			B[cnt++]=A[l++];
			cmp++;
		}
		
		for(int i=0;i<B.length;i++)A[left+i]=B[i];
	}

}

