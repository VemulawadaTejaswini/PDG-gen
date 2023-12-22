import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String A = br.readLine();
		String B = br.readLine();
		String C = br.readLine();
		
		int i=0,j=0,k=0;
		char turn = 'a';
		while(i<=A.length() && j<=B.length() && k<=C.length())
		{
			if(turn == 'a')
			{
				if(i == A.length())
				{
					System.out.println('A');
					return;
				}
				turn = A.charAt(i++);
			}
				
			else if(turn == 'b')
			{
				if(j == B.length())
				{
					System.out.println('B');
					return;
				}
				turn = B.charAt(j++);
			}
				
			else
			{
				if(k == C.length())
				{
					System.out.println('C');
					return;
				}
				turn = C.charAt(k++);
			}
		}
	}
}
