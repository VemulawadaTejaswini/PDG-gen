import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		while((s=br.readLine())!=null)
		{
			String binary = Integer.toBinaryString(Integer.parseInt(s));	

			int n = binary.length();
			for(int i=n-1;i>0;i--){
				if(binary.charAt(i)=='0') continue;
				System.out.print((int)Math.pow(2, n-i-1)+" ");
			} 
			char last = binary.charAt(0);
			System.out.print(Integer.parseInt(last+"")*(int)Math.pow(2,n-1));
			System.out.println();
		}
	}
}