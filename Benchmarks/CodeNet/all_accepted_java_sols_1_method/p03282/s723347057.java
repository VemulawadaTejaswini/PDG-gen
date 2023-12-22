import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = sc.nextLong();
		char ans = '0';
		for(int i=0; i<k; i++){
			if(s.charAt(i)!='1'){
				ans = s.charAt(i);
				break;
			}
		}
		if(ans=='0')ans = '1';
		System.out.println(ans);
	}
}