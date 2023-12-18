import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[])throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String t=br.readLine();
		int len=t.length();
		if(s.contentEquals(t.substring(0,len-1)))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
