import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] c = str.split(" ");
		int sum= Integer.parseInt(c[0])+Integer.parseInt(c[1])*5+Integer.parseInt(c[2])*10+Integer.parseInt(c[3])*50+Integer.parseInt(c[4])*100+Integer.parseInt(c[5])*500;
		if(sum>=1000){
			System.out.println("1");
		}else
			System.out.println("0");	
		}
}