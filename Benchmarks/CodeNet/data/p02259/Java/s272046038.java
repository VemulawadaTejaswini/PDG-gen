
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	static int cnt = 0;
	static PrintWriter out =new PrintWriter(System.out);
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int array[] = new int[n];
    	for(int i=0;i<n;i++) {
    		array[i] = sc.nextInt();
    	}
    	bubble(array);
    	out.print(array[0]);
    	for(int i=1;i<n;i++) {
    		out.print(" "+array[i]);
    	}
    	out.println();
    	out.println(cnt);
    	out.flush();
    }
    
    static void bubble(int[] a) {
    	for(int i=0;i<a.length;i++) {
    		for(int j=a.length-1;j>=i+1;j--) {
    			if(a[j]<a[j-1]) {
    				int temp = a[j];
    				a[j] = a[j-1];
    				a[j-1] =temp;
    				cnt++;
    			}
    				
    		}
    	}
    }
    	
}
