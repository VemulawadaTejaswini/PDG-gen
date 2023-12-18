import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int Min = 0;
	    int Max = 0;
	    int Sum  = 0;
		for(int i = 0 ; i < a.length ;i++) {
		    a[i] = sc.nextInt();
		
			Sum += a[i]; 
		
		}
		
		Min = Max = a[0];
		
		for(int i = 0 ; i < a.length ;i++) {
		   Min = Math.min(Min, a[i]);
		   Max = Math.max(Max, a[i]);
		}
		
		System.out.print(Min + " " + Max + " " + Sum);
		
		
		sc.close();
	}

}