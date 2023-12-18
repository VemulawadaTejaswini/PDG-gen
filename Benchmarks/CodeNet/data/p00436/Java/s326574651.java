import java.util.Scanner;

public class Main {

	static int[] a;
	static int n;
	
	static void riffle(){
		int[] b = new int[2*n];
		for(int i=0;i<2*n;i++){
			b[i]=a[i];
		}
		int k=0;
		for(int i=0;i<2*n;i+=2){
			a[i]=b[k];
			a[i+1]=b[n+k];
			k++;
		}
	}
	
	static void cut(int j){
		int[] b = new int[2*n];
		for(int i=0;i<2*n;i++){
			b[i]=a[i];
		}
		int k=0;
		int i;
		for(i=2*n-1;k<j;i--){
			a[i]=b[j-1-k];
			k++;
		}
		k=2*n-1;
		for(;i>=0;i--){
			a[i]=b[k--];
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		n = stdIn.nextInt();
		a = new int[2*n];
		for(int i=0;i<2*n;i++){
			a[i]=i+1;
		}
		int m = stdIn.nextInt();
		for(int i=0;i<m;i++){
			int k = stdIn.nextInt();
			if(k==0){
				riffle();
			}
			else{
				cut(k);
			}
		}
		for(int i=0;i<2*n;i++){
			System.out.println(a[i]);
		}
	}
}