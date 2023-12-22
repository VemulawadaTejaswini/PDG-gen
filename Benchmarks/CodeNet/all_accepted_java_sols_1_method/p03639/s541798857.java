import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] a = new long[N];
		int count4 = 0,count2 = 0;
		for( int i=0; i<N; i++ ){
			a[i] = sc.nextLong();
			if( a[i]%4==0 ){
				count4++;
			}
			if( a[i]%4!=0 && a[i]%2==0 ){
				count2++;
			}
		}
		if( count4>=N/2 ){
			System.out.println("Yes");
		}else if( count2>=N-(count4*2) ){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
