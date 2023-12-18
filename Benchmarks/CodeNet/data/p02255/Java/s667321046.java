import java.io.IOException;
import java.util.Scanner;
class Test {
    public static void main(String args[]) throws IOException {
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	int a[] = new int[n];
    	int val;

    	for(int i=0;i<n;i++){
    		val = scan.nextInt();
    		a[i]=val;
    	}

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
        	for(int f=0;f<n;f++){
        		System.out.print(a[f]+" ");

        	}
        	System.out.println();
    	}

    }
}