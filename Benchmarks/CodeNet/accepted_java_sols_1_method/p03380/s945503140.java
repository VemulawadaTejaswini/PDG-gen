import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int []a = new int [n];
		
		for(int i = 0;i < n ; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		int p = a[n-1]/2;
		
		int min = a[n-1] ;
		int b = 0;
		for(int i = 0; i < n-1 ;i++) {
			if(min >= Math.abs(a[i] - p)){
				min = Math.abs(a[i] - p);
				b = a[i];
			}
		}
			
		if(b == a[n-1]) {
			System.out.println(a[n-1] +" "+0);
		}
		
		else {
		    System.out.println(a[n-1]+" "+ b);
		}
		
	}
	}
