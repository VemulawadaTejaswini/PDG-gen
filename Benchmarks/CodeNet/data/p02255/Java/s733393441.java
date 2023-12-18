
import java.util.Scanner;
class Main {

	public static void printarray(int[] a,int n){
    	for(int f=0;f<n;f++){
    		if(f<n-1)System.out.print(a[f]+" ");
    		else System.out.println(a[f]);
    	}
	}

	public static void scanarray(int[] a,int n, Scanner s){
    	for(int i=0;i<n;i++){
    		a[i] = s.nextInt();
    	}
	}

    public static void main(String args[]) {
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	int a[] = new int[n];
    	int val;

    	scanarray(a,n,scan);
    	printarray(a,n);

    	int v;
    	int j;
    	for(int i=1;i<n;i++){
    		v=a[i];
    		j=i-1;
    		while(j>=0 && a[j]>v){
    			a[j+1]=a[j];
    			j--;
    		}
    		a[j+1]=v;

    		printarray(a,n);
    	}
    }
}