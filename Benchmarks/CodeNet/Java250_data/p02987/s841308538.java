 import java.util.*;
 public class Main{
	 public static void main(String arg[]){
		 Scanner sc=new Scanner(System.in);
		 String s=sc.next();
		 char ch[]=s.toCharArray();
		 Arrays.sort(ch);
		 if((ch[0]==ch[1])&&(ch[2]==ch[3])&&(ch[0]!=ch[2]))
			 System.out.println("Yes");
		 else System.out.println("No");
	 }
 }