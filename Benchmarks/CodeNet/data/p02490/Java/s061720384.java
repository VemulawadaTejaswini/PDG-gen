
import java.util.*;

public class Main {
	
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		int a[] = new int[2];
		
		a[0] = x;
		a[1] = y;
		
		Arrays.sort(a);
		
		System.out.println(a[0]+" "+a[1]);
		
		
	}

}