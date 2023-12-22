import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		long K = sc.nextLong();
		long count = 0;
		char ans = '1';
		if( S.charAt(0)!='1' ){
			ans = S.charAt(0);
		}else{
			for( int i=0; i<S.length(); i++ ){
				if( S.charAt(i)=='1' ){
					count++;
				}else{
					if( count<K ){
						ans = S.charAt(i);
					}
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
