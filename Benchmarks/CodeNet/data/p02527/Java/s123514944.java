import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a[] = new int [1000000];
		int n = stdIn.nextInt();

		for(int i=0;i<n;i++)
			a[i] = stdIn.nextInt();
		for(int i=0;i<n;i++){
			int min=i;
			for(int j=i+1;j<n;j++){
				if(a[min]>a[j])
					min=j;
			}
			if(i!=min){
				int tmp=a[i];
				a[i]=a[min];
				a[min]=tmp;
			}
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}