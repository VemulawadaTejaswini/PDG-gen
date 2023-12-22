

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.next().toUpperCase();
		char a[]=s.toCharArray();
		int count=0;
		int freq[]=new int[26];
		for(int i=0;i<a.length;i++)
		{
			freq[a[i]-'A']++;
		}
		for(int i=0;i<26;i++)
		{
			if(freq[i]==2 ||freq[i]==0) {
				
			}else {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
	
}
