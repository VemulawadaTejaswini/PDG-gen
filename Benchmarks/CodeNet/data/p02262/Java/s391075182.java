import java.util.Scanner;

public class Main {
	private static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		shellSort(a,n);
	}
	
	static void writeln(int[] a,int n){
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}
	static int insertionSort(int[] a,int n,int g){
		int cnt=0;
		for(int i=g;i<n;i++){
			int key=a[i];
			int j=i-g;
			while(j>=0 && a[j]>key){
				a[j+g]=a[j];
				j=j-g;
				cnt++;
			}
			a[j+g]=key;
		}
		return cnt;
	}
	static void shellSort(int[] a,int n){
		int g=1;
		int m=1;
		int cnt=0;
		while(3*g+1<n){
			g=3*g+1;
			m++;
		}
		System.out.println(m);
		while(g>0){
			cnt=cnt+insertionSort(a,n,g);
			System.out.print(g);
			if(g!=1)System.out.print(" ");
			g=g/3;
		}
		System.out.println();
		System.out.println(cnt);
		writeln(a,n);
	}
}