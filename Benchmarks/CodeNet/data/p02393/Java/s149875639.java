import java.io.*;
import java.util.Arrays;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] str1Ary = str.split(" ");
		Arrays.sort(str1Ary);
		for(int i = 0; i < str1Ary.length; i++){
			System.out.print(str1Ary[i] + " ");
		}
	}
}