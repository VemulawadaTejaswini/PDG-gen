import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); 
		int x=sc.nextInt(); 
		int t=sc.nextInt(); 
		
		int min=(n+x-1)/x;
		
		int result=(min)*t;
		
		System.out.println(result);
	}

}
