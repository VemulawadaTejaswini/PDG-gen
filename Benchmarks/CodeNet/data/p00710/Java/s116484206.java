import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int r = sc.nextInt();
			if (n==0&&r==0) {
				break; 
			}
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=i+1;
			}
			for(int j=0;j<r;j++){
				int p=sc.nextInt();
				int c=sc.nextInt();
				int[] buffer=new int[n];
				for(int i=0;i<c;i++){
					buffer[i]=a[n-p-i];
				}
				for(int i=1;i<p;i++){
					a[n-p-c+i]=a[n-p+i];
				}
				for(int i=0;i<c;i++){
					a[n-i-1]=buffer[i];
				}
			}
			System.out.println(a[n-1]);
		}
	}