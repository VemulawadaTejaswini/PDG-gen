
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			String str = cin.next();
			int ans=-1;
			String s1 = str.substring(0, str.indexOf('+'));
			String s2 = str.substring(str.indexOf('+')+1, str.indexOf('='));
			String s3 = str.substring(str.indexOf('=')+1);
			for(int i = 0; i < 10; i++){
				String a1=X(s1,i);
				String a2=X(s2,i);
				String a3=X(s3,i);
				if(a1.length()!=1&&a1.charAt(0)=='0'){
					continue;
				}
				if(a2.length()!=1&&a2.charAt(0)=='0'){
					continue;
				}
				if(a3.length()!=1&&a3.charAt(0)=='0'){
					continue;
				}
				BigInteger a = new BigInteger(a1);
				BigInteger b = new BigInteger(a2);
				BigInteger c = new BigInteger(a3);
				if(a.add(b).equals(c)){
					ans=i;
					break;
				}
			}
			if(ans==-1){
				System.out.println("NA");
			}
			else{
				System.out.println(ans);
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