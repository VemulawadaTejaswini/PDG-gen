import java.util.Scanner;

class Main {
	
	
	static void printa(int[] a,int n){
		for(int i=0;i<n-1;i++){
			System.out.printf("%d ",a[i]);
		}
		System.out.println(a[n-1]);
		return;
	}
	
	static void swap(int[] a,int x,int y){
		int temp=a[x];
		a[x]=a[y];
		a[y]=temp;
		return;
	}
	
	static int bubblesort(int[] a,int n){
		int cnt=0;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(a[j] > a[j+1]){
					swap(a,j,j+1);
					cnt++;
				}
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int[] a=new int[n];
		
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		
		int cnt=bubblesort(a,n);
		
		printa(a,n);
		
		System.out.println(cnt);
		
	}
}
