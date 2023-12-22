import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s, s1;
		while((s=br.readLine())!=null)
		{
			int[] a = new int[4], b = new int[4];
			int hit=0, blow=0;
			for(int i=0; i<4; i++) a[i] = Integer.parseInt(s.split(" ")[i]);
			s1=br.readLine();
			for(int i=0; i<4; i++) b[i] = Integer.parseInt(s1.split(" ")[i]);
			
			for(int i=0; i<4; i++){
				for(int j=0; j<4; j++){
					if(a[i] == b[j] && i==j) hit++;
					else if(a[i] == b[j])   blow++;
				}
			}
			System.out.println(hit + " " + blow);
		}
    }
}