import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=
		new BufferedReader(new InputStreamReader(System.in));
		
		String str1=br.readLine();
		String[] strs=str1.split(" ",2);
		long[] nums =new long[2];
		for(int i=0;i<2;i++){
			nums[i]=Long.parseLong(strs[i]);
		}
		if(nums[0]>nums[1]){
			nums[0]=nums[0]%nums[1];}
		
		System.out.println(Math.min(nums[0],(nums[1]-nums[0])));
	}
}
