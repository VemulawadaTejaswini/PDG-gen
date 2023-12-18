import java.io.*;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while(n-- != 0)
		{         
			int score = 0;         
			int[] runner = new int[3];         
			int outCount = 0;         
			while(outCount < 3)         
			{             
				String str = br.readLine();
				if(str.equals("HIT"))             
				{                 
					if(runner[2] == 1)                 
					{                     
						++score;                 
					}                 
				runner[2] = runner[1];                 
				runner[1] = runner[0];                 
				runner[0] = 1;             
				}             
				else if(str.equals("HOMERUN"))             
				{                 
					for(int i = 0; i < 3; ++i)                 
					{                     
						if(runner[i] == 1)                     
						{                         
							++score;                     
						}                     
						runner[i] = 0;                 
					}                 
					++score;             
				}             
				else if(str.equals("OUT"))             
				{                 
					++outCount;             
				}         
			}  
			System.out.println(score); 
		} 
	}
}