import java.util.Scanner;

class Main
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[101];
		int v;
		
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++){
			a[i] = scan.nextInt();
		}
		
		for(int i=1; i<=n; i++){
			v = a[i];
			for(int q=i-1; q>0; q--){
				if(v > a[q]){
					for(int j=i; j>q; j--){
						a[j] = a[j-1];
					}
					a[q+1] = v;
					break;
				}
				else if(q==1){
					for(int j=i; j>0; j--){
						a[j] = a[j-1];
					}
					a[q] = v;
				}
			}
			for(int h=1; h<=n; h++){
				System.out.print(a[h]);
				if(h!=n){
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}
