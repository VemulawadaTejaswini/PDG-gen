//package ABC172;
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		String s1=sc.next();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=s1.charAt(i))
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
