import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer> cars = new Stack<Integer>();
		String s;
		while((s=br.readLine())!=null){
			int num = Integer.parseInt(s);
			
			if(num==0)
				System.out.println(cars.pop());
			else 	
				cars.push(num);
			if(cars.isEmpty()) break;
		}
	}
}