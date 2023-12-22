import java.util.Scanner;

class Main
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[100];
		int b = 1;
		int x = 0;
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++){
			a[i] = scan.nextInt();
		}
		
		while(b==1){
			b = 0;
			for(int i=n-1; i>=1; i--){
				if(a[i] < a[i-1]){
					int kari = a[i];
					a[i] = a[i-1];
					a[i-1] = kari;
					b = 1;
					x++;
				}
			}
		}
		
		for(int i=0; i<n; i++){
			System.out.print(a[i]);
			if(i!=n-1){
				System.out.print(" ");
			}
			else{
				System.out.print("\n");
			}
		}
		
		System.out.println(x);
	}
}
