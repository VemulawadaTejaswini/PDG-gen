import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
			String s1=sc.next();
			int n1=s1.length();
			String s2=sc.next();
			int n2=s2.length();
			int min=Integer.MAX_VALUE;
			for(int i=0;i<n1-n2+1;i++) {
				String temp=s1.substring(i,i+n2);
				int count=0;
				for(int j=0;j<temp.length();j++) {
					if(temp.charAt(j)!=s2.charAt(j)) count++;
				}
				min=Math.min(count, min);
            }
			System.out.println(min);
	}
}
