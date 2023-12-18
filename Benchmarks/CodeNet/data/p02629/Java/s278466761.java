
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		long t=Long.parseLong(br.readLine().trim());
		

		System.out.println(algo(t));
	}
	
	public static String algo(long n) {
		if(n<=26) {
			return algo2(n);
		}
		
//		String res=algo(n/2)+algo(n-n/2);
		//
		
		
		long n2=n/26;
		long n1=n%26;
		String res=algo(n2)+algo2(n1);
		return res;	
	}
	
	public static String algo2(long n) {
		char a=(char)(96+n);
//		System.out.println(a+" "+n);
		String s1=String.valueOf(a);
//		s1=a;
		return s1;
	}
	
	
	

}
