

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		sc.nextLine();
//		
//		Set<String> dic = new HashSet<>();
		
		Scanner sc=new Scanner(System.in);
		Set<String> dic=new HashSet<>();
		int n=sc.nextInt();
		String com,word;
		for(int i=0;i<n;i++){
			com=sc.next();
			word=sc.next();
			if(com.equals("insert")){
				dic.add(word);
			}
			else if(dic.contains(word)){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
		}
		
//		for(int i=0;i<n;i++)
//		{
//			String[] str = sc.nextLine().split(" ");
//			
//			if(str[0].equals("insert"))
//			{
//				dic.add(str[1]);
//			}
//			
//			if(str[0].equals("find"))
//			{
//				if(dic.contains(str[1]))
//					System.out.println("yes");
//				else
//					System.out.println("no");
//			}
//		}
		
	}
}

