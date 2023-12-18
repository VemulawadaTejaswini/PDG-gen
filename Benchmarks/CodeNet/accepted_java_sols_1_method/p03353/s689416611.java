/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int a = sc.nextInt();//, b = sc.nextInt(), c=  sc.nextInt(), d = sc.nextInt();
		Set<String> list = new HashSet<>();
		big:
		for(int i=0;i<str.length();i++){
			for(int ii=i+1;ii<=str.length();ii++){
				if(ii-i>a) continue big;
				list.add(str.substring(i,ii));
			}
		}
		Iterator<String> iter = list.iterator();
		List<String> list1  = new ArrayList<>();
		while(iter.hasNext()){
			String s = iter.next();
			list1.add(s);
		}
		Collections.sort(list1);
		/*Collections.sort(list1, new Comparator<String>(){
			public int compare(String s1, String s2){
				int len1 = s1.length();
				int len2  = s2.length();
				if(len1<len2){
					for(int i=0;i<len1;i++){
						if(s1.charAt(i)<s2.charAt(i)){
							return -1;
						}
						if(s1.charAt(i)>s2.charAt(i)){
							return 1;
						}
					}
					return -1;
				}
				if(len1>len2){
					for(int i=0;i<len2;i++){
						if(s1.charAt(i)<s2.charAt(i)){
							return 1;
						}
						if(s1.charAt(i)>s2.charAt(i)){
							return -1;
						}
					}
					return -1;
				}
				for(int i=0;i<s1.length();i++){
						if(s1.charAt(i)<s2.charAt(i)){
							return -1;
						}
						if(s1.charAt(i)>s2.charAt(i)){
							return 1;
						}
						
					}
				return 0;
			}
		});*/
		
		System.out.println(list1.get(a-1));//return;
		
	}
}