
import java.util.*;

public class Main {
	
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		int x;
		int y;
		
		do{
		
		x = scan.nextInt();
		y = scan.nextInt();
		
		if(x==0 && y==0)
			System.exit(0);
		
		int a[] = new int[2];
		
		a[0] = x;
		a[1] = y;
		
		Arrays.sort(a);
		
		System.out.println(a[0]+" "+a[1]);
		
		}while(x!=0 || y!=0);
		
	}

}