import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException
	{
		int x = -1;
		int a[] = new int[10000];
		String s;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int i = 1;
		while(true) {
			s = br.readLine();
			x = Integer.parseInt(s);
			if(x == 0) break;
			else {
				System.out.println("Case "+i+": "+x);
				i++;
			}
		}
	}
}