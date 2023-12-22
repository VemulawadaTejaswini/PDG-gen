import java.io.*;
import java.util.Arrays;



public class Main{
	public static void main(String[] a)  throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[10];
		for(int i=0; i<10; i++){
			num[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(num);
		for(int i=num.length-1; i>num.length-4; i--){
			System.out.println(num[i]);
		}
		}
}