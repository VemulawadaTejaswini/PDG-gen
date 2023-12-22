import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] rate = new int[13];
		int count1 = 0,count2 = 0;
		for( int i=0; i<N; i++ ){
			rate[sc.nextInt()/400]++;
		}
		for( int i=0; i<=7; i++ ){
			if( rate[i]>0 ){
				count1++;
			}
		}
		for( int i=8; i<=12; i++ ){
			count2 += rate[i];          
		}
		if( count1==0 ){
			System.out.println(1+" "+count2);
		}else{
			System.out.println(count1+" "+(count1+count2));
		}
	}
}
