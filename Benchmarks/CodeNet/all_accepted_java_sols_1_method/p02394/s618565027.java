import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(
				new InputStreamReader (System.in));
		String line=br.readLine();
		String[] str = line.split(" ");
		int W=Integer.parseInt(str[0]);
		int H=Integer.parseInt(str[1]);
		int x=Integer.parseInt(str[2]);
		int y=Integer.parseInt(str[3]);
		int r=Integer.parseInt(str[4]);
		if(0<=x-r && x+r<=W && 0<=y-r && y+r<=H) System.out.println("Yes");
		else System.out.println("No");
	}
}