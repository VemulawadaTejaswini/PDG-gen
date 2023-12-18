import java.lang.*;
import java.util.*;
import java.io.*;

public class Main
{
	public static void main (String[] arg)throws IOException
	{
		int sum[]= new int[101];
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String line;
		int max=0;
		while ((line = input.readLine()) != null && !line.isEmpty()) {
			int	num=Integer.parseInt(line);
			sum[num]++;
		}
		for(int i=0;i<100;i++){
			max=Math.max(max, sum[i]);
		}
		for(int j=0;j<100;j++){
			if(sum[j]==max){
			System.out.println(j);
			}
		}
	}
}	