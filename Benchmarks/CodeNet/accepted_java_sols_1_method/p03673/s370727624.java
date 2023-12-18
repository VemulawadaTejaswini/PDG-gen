import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		boolean first = true;
		int i;
		for(i=n-1; i>1; i-=2) {
			if(first) {
				first = false;
			}else{
				System.out.print(" ");
			}
			System.out.print(a[i]);
		}
		if(first) {
			first = false;
		}else{
			System.out.print(" ");
		}
		System.out.print(a[i]);
		
		for(i=((i==1)?0:1) ; i<n; i+=2) {
			System.out.print(" ");
			System.out.print(a[i]);
		}
		
	}

}
