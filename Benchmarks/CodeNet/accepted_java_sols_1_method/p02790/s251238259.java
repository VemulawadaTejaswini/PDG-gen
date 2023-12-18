import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if( a < b ){
			int c = a ;
			a = b ;
			b = c; //swap
		}
		for(int i = 0 ; i  < a ; i++){
			System.out.print(b);
		}
	}
}
