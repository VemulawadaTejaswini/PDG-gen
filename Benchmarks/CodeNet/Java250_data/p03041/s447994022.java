import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		String S,str1,str2,Ans;
		int N,K;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		S = sc.next();
		
		char c;
		c = S.charAt(K-1);
		c+=32;
		
		str1 = S.substring(0,K-1);
		str2 = S.substring(K);
		
		Ans = str1 + String.valueOf(c) + str2;
		System.out.println(Ans);
	}
}