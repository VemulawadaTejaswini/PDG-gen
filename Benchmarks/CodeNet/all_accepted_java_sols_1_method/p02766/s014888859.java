import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int count = 0;
		for( int i=0; i<40; i++ ){
			if( N>=K ){
				count++;
				N = N/K;
			}else{
				break;
			}
		}
		System.out.println(count+1);
	}
}