import java.io.*;

public class Main3_2 {
	public static void main(String[] args) throws IOException
	{
		int x = -1;
		int a[] = new int[100];
		String s;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int i = 0;
		while(x != 0) {
			s = br.readLine();
			x = Integer.parseInt(s);
			a[i] = x;
			i++;
		}
		
		for(i = 0; a[i] != 0; i++) {
			System.out.println("Case "+i+": "+a[i]);
		}
	}
}