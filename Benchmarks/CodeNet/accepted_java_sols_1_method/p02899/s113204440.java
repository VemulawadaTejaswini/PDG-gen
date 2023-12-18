import java.util.*;

public class Main {
	
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n=Integer.parseInt(scan.next());
		int[] a=new int [n];
		int[] array=new int [n];
		for (int i=0;i<n;++i) {
			a[i]=Integer.parseInt(scan.next());
		}
		
		for (int i=0;i<n;++i) {
			array[a[i]-1]=i+1;
			
		}
		
		for(int i:array) {
			System.out.println(i);
		}
}		
}
//end