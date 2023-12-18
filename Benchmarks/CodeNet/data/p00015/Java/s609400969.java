import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++)
		{
		    String s1 = br.readLine();
		    String s2 = br.readLine();
		    if(s1.length() > 80 || s2.length() > 80)
			System.out.println("overflow");
		    else if ((s1.length() < 10) && (s2.length() < 10)) {
			System.out.println(Integer.parseInt(s1.toString()) + 
					   Integer.parseInt(s2.toString()));
		    } else {	
			Stack budget = cal(s1,s2);
			int m = budget.size();
			if( m > 80 ) System.out.println("overflow");
			else {
			    for(int j=0; j<m; j++)
			    System.out.print(budget.pop());
			    System.out.println();
			}
		    }
		 }
	}

	private static Stack cal(String s1, String s2)
	{
		Stack<Byte> a = new Stack<Byte>();
		Stack<Byte> b = new Stack<Byte>();
		Stack<Byte> c = new Stack<Byte>();
		char[] char1 = s1.toCharArray();
		char[] char2 = s2.toCharArray();
		int lenA = char1.length, lenB = char2.length, max = Math.max(lenA, lenB);
		for(int i=0; i<	lenA; i++) 
			a.push(Byte.parseByte(char1[i]+""));
		for(int i=0; i< lenB; i++)
			b.push(Byte.parseByte(char2[i]+""));

		byte temp=0, roundup=0; //determine whether round up is needed
		for(int i=0; i<max; i++)
		{
		    if( !a.isEmpty() && !b.isEmpty() ) {
		        temp = a.pop() + b.pop() + roundup;
		    } else if( a.isEmpty() ) {
			temp = b.pop() + roundup;
		    } else {
			temp = a.pop() + roundup;
		    }

		    if(temp>9) {roundup = 1; temp-=10;}
		    else       roundup = 0;
		    c.push(temp);
		    if(i==max-1 && roundup == 1)
			c.push((byte)1);
		}
		return c;
	}
}