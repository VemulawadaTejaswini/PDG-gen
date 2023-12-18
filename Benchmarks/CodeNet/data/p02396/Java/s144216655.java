import java.io.*;

class Main{
	public static void main (String[ ] args) throws Exception{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

		for(int i = 1;; i++)
		{
			int n = Integer.parseInt(br.readLine());
			if(0 == n)
			{
				break;
			}
			System.out.println("Case " + i + ": " + n);
		}
	}
}