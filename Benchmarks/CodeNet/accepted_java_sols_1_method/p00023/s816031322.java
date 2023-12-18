import java.lang.*;
import java.util.*;
import java.io.*;

public class Main
{
	public static void main (String[] arg)throws IOException
	{
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String line;
		line=input.readLine();
		int a = Integer.parseInt(line);
		StringTokenizer tokenizer;
		double[] r1= new double[3];
		double[] r2= new double[3];
			
		for(int i=0;i < a; i++){
			tokenizer = new StringTokenizer(input.readLine());
			for(int j=0;j < 3; j++ ){
				r1[j]=Double.parseDouble(tokenizer.nextToken());
			}
			for(int j=0;j < 3; j++ ){
				r2[j]=Double.parseDouble(tokenizer.nextToken());
			}
			double dis=0;
			dis=Math.sqrt(Math.pow((r1[0]-r2[0]),2)+ Math.pow((r1[1]-r2[1]),2));
			if(dis>r2[2]+r1[2])
			{
				System.out.println("0");
			}else{
				if(dis+r2[2]<r1[2])	{
					System.out.println("2");
				}else{
					if(dis+r1[2]<r2[2]) {
						System.out.println("-2");
					}else{
						System.out.println("1");
					}
				}
			}
		}	
	}
}	
		