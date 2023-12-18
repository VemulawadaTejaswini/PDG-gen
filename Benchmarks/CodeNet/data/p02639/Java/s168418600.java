
import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] cmd=br.readLine().split(" ");
		for(int i=0;i<5;i++)
		{
			if(Integer.valueOf(cmd[i])==0)
			{
				System.out.println(i+1);
				break;
			}
		}
	}

}
