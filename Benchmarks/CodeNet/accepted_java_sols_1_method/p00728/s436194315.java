import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while( true ){
			int n = Integer.parseInt(scan.next());
			if( n <= 0 ){
				break;
			}
			int max = 0, min = 1000, sum = 0;
			int temp = 0;
			for( int i = 0; i < n; i++ ){
				temp = Integer.parseInt(scan.next());
				if( temp > max ){
					max = temp;
				}
			if( temp < min ){
					min = temp;
				}
				sum += temp;
			}
			
			System.out.println((sum-max-min)/(n-2));
		}
		return;
	}
}