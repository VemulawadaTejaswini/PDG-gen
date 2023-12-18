import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	   String s=input.next();
	    long reminder,sum=0;
			
	    for(int i=0;i<s.length();i++)
			{
				int x=s.charAt(i)-'0';
				sum+=x;
		     }
			if(sum%9==0)
				System.out.println("Yes");
			else
				System.out.println("No");
 }

}