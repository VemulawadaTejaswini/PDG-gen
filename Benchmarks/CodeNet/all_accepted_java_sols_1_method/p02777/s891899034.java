import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		int a=sc.nextInt();
		int n=sc.nextInt();
		String p=sc.next();
		if(p.equals(s) && p.equals(t)){
			System.out.println((a-1)+" "+(n-1));
		}else if(p.equals(s)){
			System.out.println((a-1)+" "+n);
		}else if(p.equals(t)){
			System.out.println(a+" "+(n-1));
		}else{
			System.out.println(a+" "+n);
		}
	}
}
