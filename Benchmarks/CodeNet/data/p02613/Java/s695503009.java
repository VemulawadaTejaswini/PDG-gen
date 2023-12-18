import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int ac = 0,wa= 0,tle= 0,re=0;
		
		while(n-- > 0)
		{
			
		
		char ch = br.readLine().charAt(0);
		//System.out.println(ch);
		switch(ch)
		{
			case 'A':
			{
				ac++;
				break;
			}
				
			case 'W':
			{
				wa++;
				break;
			}
				
			case 'T':
			{
				tle++;
				break;
			}
			
			case 'R':
			{
				re++;
				break;
			}
		
		}
		}
		System.out.println("AC x "+ac);
		System.out.println("WA x "+wa);
		System.out.println("TLE x "+tle);
		System.out.println("RE x "+re);
	}

}
