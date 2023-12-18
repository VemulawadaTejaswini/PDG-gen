import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int x = sc.nextInt();
		 
		 int[] a= new int[n];
		 int hoge;
		 
		 for(int i=0;i<n;i++) a[i] = sc.nextInt();
		 
		 for(int i=0;i<n;i++) {
			 for(int j=i+1;j<n;j++) {
				 if(a[i]>a[j]) {
					 hoge = a[i];
					 a[i] = a[j];
					 a[j] = hoge;
				 }
			 }
		 }
		 

		int i=0;
		int child=0;
		 while(n>0 && a[i]<=x) {
			 child++;
			 x -= a[i];
			 i++;
			 n--;
		 }
		 if(n==0 && x>0)child--;
		 
		 System.out.println(child);
	}
}
