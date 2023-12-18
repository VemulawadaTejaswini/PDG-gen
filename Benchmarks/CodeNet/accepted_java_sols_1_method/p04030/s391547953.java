//package AtCoder;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!='B')
			{
				st.push(c);
		
			}
			else
			{
				if(!st.isEmpty())
					st.pop();
			}
		}
		String ans="";
		while(!st.isEmpty())
			ans=st.pop()+ans;
		
		System.out.println(ans);

	}

}
