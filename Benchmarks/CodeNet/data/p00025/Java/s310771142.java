import java.lang.*;
import java.util.*;
import java.io.*;

public class Main
{
	public static void main (String[] arg)throws IOException
	{
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String line;
		StringTokenizer tokenizer1,tokenizer2;
		int a[] = new int[4];
		int b[] = new int[4];
		
		while ((line = input.readLine()) != null && !line.isEmpty()) {
			int blow=0,hit=0;
			tokenizer1 = new StringTokenizer(line);
			tokenizer2 = new StringTokenizer(input.readLine());
			for(int i=0;i<4;i++){
				a[i]=Integer.parseInt(tokenizer1.nextToken());
				b[i]=Integer.parseInt(tokenizer2.nextToken());
			}
			for(int j=0;j<4;j++){
				for(int k=0;k<4;k++){
					if(a[j]==b[k]){
						if(j==k){
							hit++;
						}else{
							blow++;
						}
					}
				}
			}
			System.out.println(hit+" "+blow);
		}
	}
}	