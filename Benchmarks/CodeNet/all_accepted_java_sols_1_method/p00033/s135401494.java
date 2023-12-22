import java.util.Stack;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> a = new Stack<Integer>();
		Stack<Integer> b = new Stack<Integer>();
		boolean yes_no;
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			a.push(0); b.push(0);
			yes_no = true;
			for (int j = 0; j < 10; j++) {
				int num = Integer.parseInt(s.split(" ")[j]);
				int	subA = num - a.peek(); 
				int subB = num - b.peek();
				if(subA < 0 && subB < 0){
					yes_no = false;
					break;
				}
				else if (subA > 0 && subB > 0) {
					if(subA <= subB)
						a.push(num);
					else
						b.push(num);
				}
				else if	(subB >= subA)
					b.push(num);
				else
					a.push(num);
			}
			if(yes_no) System.out.println("YES");
			else 	   System.out.println("NO");
		}
	}
}