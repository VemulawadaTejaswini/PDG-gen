import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		int ans=0;
		for(int i=0;i<str1.length();i++){
		    if(str1.charAt(i)!=str2.charAt(i))
		    ans++;
		}
		System.out.println(ans);
	}
}
