import java.util.*;
public class A{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Sort sort = new Sort();
		int n = scanner.nextInt();
		int[] a=new int[n];
		int i=0;
		while(i<n){
			a[i]=scanner.nextInt();
			i++;
		}
		sort.insertionSort(a, n);

	}
}

class Sort{
	public Sort(){}
	public void insertionSort(int[] a, int n){
		for(int i=1;i<a.length;i++){
			int v=a[i];
			int j=i-1;
			while(j>=0&&a[j]>v){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=v;
			printing(a);
		}
	}
	public void printing(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
