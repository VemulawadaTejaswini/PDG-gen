import java.util.*;
class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		char[]in=s.nextLine().toCharArray();
		long r=1;
		int[]c=new int[26];
		for(int i=0;i<in.length;++i)
			r+=i-c[in[i]-'a']++;
		System.out.println(r);
	}
}