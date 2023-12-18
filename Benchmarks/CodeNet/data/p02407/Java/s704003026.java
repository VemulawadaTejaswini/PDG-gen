import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n,i,copy;
		n=stdIn.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++){
			a[i]=stdIn.nextInt();
		}
		for(i=0;i<n/2;i++){
			copy=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=copy;
		}
		for(i=0;i<n;i++){
			System.out.print(a[i]);
			if(i==n-1){
			}else{
				System.out.print(" ");
			}
		}
		stdIn.close();
	}
}

