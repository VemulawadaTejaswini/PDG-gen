import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			String str = cin.next();
			int count=0;
			String s1 = str.substring(0, str.indexOf('+'));
			String s2 = str.substring(str.indexOf('+')+1, str.indexOf('='));
			String s3 = str.substring(str.indexOf('=')+1);
			for(int i = 0; i < 10; i++){
				BigInteger a = new BigInteger(X(s1, i));
				BigInteger b = new BigInteger(X(s2, i));
				BigInteger c = new BigInteger(X(s3, i));
				
				if(a.add(b).equals(c)){
					count=i;
				}
			}
			if(count==0){
				System.out.println("NA");
			}
			else{
				System.out.println(count);
			}
		}
	}
	static String X(String str, int a){
		char[] s = new char[str.length()];
		for(int i = 0; i < s.length; i++){
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
				s[i]=str.charAt(i);
			}
			else{
				s[i]=(char)('0'+a);
			}
		}
		return String.valueOf(s);
	}
}