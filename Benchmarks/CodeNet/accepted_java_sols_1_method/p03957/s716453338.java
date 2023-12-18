import java.util.*;
public class Main{
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		Stack<Character> q=new Stack<>();
		String str=input.next();
		char a[]=str.toCharArray();
		for(int i=0;i<a.length;i++) {
			char c=a[i];
			if(q.isEmpty()&&c=='C')
				q.add(c);
			else 
			if(!q.contains(c)&&c=='F'&&!q.isEmpty())
				q.add(c);
		}
		
	if(q.size()==2&&q.get(0)=='C') {
		
		System.out.println("Yes");}
	else {
		System.out.println("No");}	
	}		
}