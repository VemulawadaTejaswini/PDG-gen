import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{

	public static void main(String[] args) throws IOException
	{
		//int nMax;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		
		while(true)
		{
			String str = br.readLine();
			
			if(str.equals("0") ) break;
			
			char[] cArray = str.toCharArray();
			
			System.out.println(SumDigit(cArray) );
		}
	}
	
	static int SumDigit(char[] cArray)
	{
		int sum=0;
		int[] nArray = new int[cArray.length];
		
		for(int i=0; i<cArray.length; i++)
		{
			nArray[i] = Character.getNumericValue(cArray[i]);
			sum += nArray[i];
			
		}
		
		return sum;
	}
	
}