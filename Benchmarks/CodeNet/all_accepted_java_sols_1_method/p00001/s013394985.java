import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static Scanner sc =  new java.util.Scanner(System.in);
	
	public static void main(String[] args) {
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();
	int e = sc.nextInt();
	int f = sc.nextInt();
	int g = sc.nextInt();
	int h = sc.nextInt();
	int i = sc.nextInt();
	int j = sc.nextInt();
			
	int [] array = new int [] {a,b,c,d,e,f,g,h,i,j};
	Arrays.sort(array);
	
	for ( int n = 9; n >= 7 ; n--){
		System.out.println( array[n] );
	}
}

}