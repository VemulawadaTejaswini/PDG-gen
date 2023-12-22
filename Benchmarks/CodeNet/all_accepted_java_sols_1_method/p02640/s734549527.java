
import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] cmd=br.readLine().split(" ");
		int x=Integer.valueOf(cmd[0]);
		int y=Integer.valueOf(cmd[1]);
		int a=y-2*x;
		int b=4*x-y;
		if(a>=0 && a%2==0 && b>=0 && b%2==0)
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}

}
