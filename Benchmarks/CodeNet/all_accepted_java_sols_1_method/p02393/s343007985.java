import java.io.IOException;
import java.util.Scanner;

public class Main{
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int a[] = {in.nextInt(), in.nextInt(), in.nextInt()};
		int b;
		
		if(a[1] < a[0]){
			b = a[0];
			a[0] = a[1];
			a[1] = b;
		}
		
		if (a[2] < a[1]){
			if(a[2] < a[0]){
				b = a[2];
				a[2] = a[0];
				a[0] = b;
			}
			b = a[2];
			a[2] = a[1];
			a[1] = b;
		}
		
		System.out.println(a[0] + " " + a[1] + " " + a[2]);
		
	}
}