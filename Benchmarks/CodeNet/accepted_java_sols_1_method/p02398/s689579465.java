import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x;
		int a, b, c, count = 0;
		x = br.readLine();
		String[] ary = x.split(" ");
		a = Integer.parseInt(ary[0]);
		b = Integer.parseInt(ary[1]);
		c = Integer.parseInt(ary[2]);
		
		for(int i = a; i <= b; i++){
			if(c%i==0){
				count++;
			}
		}
		
		System.out.println(count);

	}
}