import java.util.*;
import java.io.*;
class Main{

	static int count=0; //number of comparisons
	public static void main(String[]args) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		//Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out, true);
		int n=Integer.parseInt(in.readLine());
		String str[]=in.readLine().split(" ");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(str[i]);
		merge_sort(a, 0, n-1);
		for(int i=0;i<n;i++){
			if(i==n-1)
				out.printf(a[i]+"\n");
			else
				out.print(a[i]+" ");
		}
		out.println(count);
	}

	public static void merge_sort(int[] arr, int left, int right){
		if(left<right){
			int m=(left+right)/2;

			merge_sort(arr, left, m);
			merge_sort(arr, m+1, right);

			merge(arr, left, m, right);
		}
	}

	public static void merge(int[] arr, int left, int mid, int right){
		int n1=mid-left+1;
		int n2=right-mid;

		int l[]=new int[n1];
		int r[]=new int[n2];

		for(int i=0;i<n1;i++)
			l[i]=arr[left+i];
		for(int j=0;j<n2;j++)
			r[j]=arr[mid+1+j];

		int i=0, j=0;
		
		int k=left;

		while(i<n1 && j<n2){
			if(l[i]<=r[j]){
				arr[k]=l[i];
				i++;
			}else{
				arr[k]=r[j];
				j++;
			}
			k++;
			count++;
		}

		while(i<n1){
			arr[k]=l[i];
			i++;
			k++;
			count++;
		}
		while(j<n2){
			arr[k]=r[j];
			j++;
			k++;
			count++;
		}
	}
}
