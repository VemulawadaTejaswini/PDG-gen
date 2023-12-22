

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		String t=scan.next();
		ArrayList<Integer>[] sad=new ArrayList[26];
		TreeSet<Integer> set[]=new TreeSet[26];
		int count1[]=new int[26];
		int count2[]=new int[26];
		for(int i=0;i<26;i++)
		{
			set[i]=new TreeSet<Integer>();
		}
		for(int i=0;i<s.length();i++)
		{
			count1[s.charAt(i)-'a']++;
			set[s.charAt(i)-'a'].add(i);
		}
		for(int i=0;i<t.length();i++) {
			count2[t.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++)
		{
			if(count1[i]==0 && count2[i]!=0)
			{
				System.out.println(-1);
				return;
			}
		}
		int pos=-1;
		long times=0;
		
		for(int i=0;i<t.length();i++)
		{
			int x=t.charAt(i)-'a';
//			int cur=set[x].higher(pos);
			if(set[x].last()<=pos) {
				times++;
				pos=set[x].first();
				
			}else {
				pos=set[x].higher(pos);
			}
//			System.out.print/ln(pos);
			
		}
		long ans=(s.length()*1L*times)+pos+1L;
		System.out.println(ans);
	
		
		
		
	}
}
