import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int count1 = 0,count2 = 0;
		for( int i=0; i<S.length(); i++ ){
			char ch = S.charAt(i);
			if( i%2==0 ){
				if( ch=='0' ){
					count1++;
				}else{
					count2++;
				}
			}else{
				if( ch=='1' ){
					count1++;
				}else{
					count2++;
				}
			}
		}
		System.out.println(Math.min(count1,count2));
	}
}
