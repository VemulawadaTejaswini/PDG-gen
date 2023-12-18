import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		int[] al=new int[26];
		long ans=(long)A.length()*(A.length()-1)/2;
		for(int i=0; i<A.length(); i++){
			ans-=al[A.charAt(i)-'a'];
			al[A.charAt(i)-'a']++;
		}
		System.out.println(ans+1);
	}
}
