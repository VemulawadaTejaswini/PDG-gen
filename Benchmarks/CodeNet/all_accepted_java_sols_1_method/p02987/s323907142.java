
import java.util.*;


public class Main {
	
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		char[] st = s.next().toCharArray();
		int[] a = new int[26];
		for(int i = 0;i<4;i++)
			a[st[i]-'A']++;
		
		int c=  0;
		for(int i=0;i<26;i++)
		{
			if(a[i]>0 && a[i]==2)
				c++;
		}
		if(c==2)System.out.println("Yes");
		else System.out.println("No");
	}
}
