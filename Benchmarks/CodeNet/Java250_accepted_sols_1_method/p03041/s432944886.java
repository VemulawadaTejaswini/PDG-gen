import java.util.*;
    public class Main{ 
    public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		String s=sc.next();
		char ch[]=s.toCharArray();
		ch[b-1]=Character.toLowerCase(ch[b-1]);
		String s1=new String(ch);
		System.out.println(s1);
	}
}