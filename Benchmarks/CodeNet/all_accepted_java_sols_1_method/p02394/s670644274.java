import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int w = Integer.parseInt(s[0]);
		int h = Integer.parseInt(s[1]);
		int x = Integer.parseInt(s[2]);
		int y = Integer.parseInt(s[3]);
		int r = Integer.parseInt(s[4]);
		
		String result = "Yes";
		
		if(x-r<0||y-r<0)result = "No";
		if(x+r>w||y+r>h)result = "No";
		
		System.out.println(result);
	}
}