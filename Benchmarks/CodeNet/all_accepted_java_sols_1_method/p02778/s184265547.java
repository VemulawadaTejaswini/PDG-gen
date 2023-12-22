import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		String ans ="";
		for(int i=0;i<n;i++)ans+='x';
		System.out.println(ans);
	}
}