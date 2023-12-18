import java.io.*;

class Test
{
	public static void main(String[] args)
	{
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			int count = 0;
			for(int a = 0; a < 10; ++a)
			{
				for(int b = 0; b < 10; ++b)
				{
					for(int c = 0; c < 10; ++c)
					{
						for(int d = 0; d < 10; ++d)
						{
							if((a + b + c + d) == n)
							{
								count = count + 1;
							}
						}
					}
				}
			}
			System.out.println(count);
		}catch(IOException e){
			System.out.println("ERROR");
		}
	}
}